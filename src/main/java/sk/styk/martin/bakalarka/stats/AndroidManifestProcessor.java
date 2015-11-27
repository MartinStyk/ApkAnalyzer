package sk.styk.martin.bakalarka.stats;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 25.11.2015.
 */
public class AndroidManifestProcessor {

    private static final Logger logger = LoggerFactory.getLogger(AndroidManifestProcessor.class);
    private static AndroidManifestProcessor instance = null;
    private Document doc;
    private ApkData data;
    private File manifestFile;

    private AndroidManifestProcessor() {
        // Exists only to defeat instantiation.
    }

    public static AndroidManifestProcessor getInstance(ApkData data) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }

        if (instance == null) {
            instance = new AndroidManifestProcessor();
        }
        instance.data = data;
        return instance;
    }

    public void processAndroidManifest() {
        try {

            manifestFile = new File(ApkDecompiler.TEMP_FOLDER_UNZIP + File.separator + "AndroidManifest.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(manifestFile);

            doc.getDocumentElement().normalize();

            getNumberOfAppComponents();
            getUsedPermissions();
            getUsedLibraries();
            getUsedFeatures();

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.toString());
        } finally {
            doc = null;
        }
    }

    private void getNumberOfAppComponents() {
        NodeList activityList = doc.getElementsByTagName("activity");
        NodeList serviceList = doc.getElementsByTagName("service");
        NodeList receiverList = doc.getElementsByTagName("receiver");
        NodeList providerList = doc.getElementsByTagName("provider");

        data.setNumberOfActivities(activityList.getLength());
        data.setNumberOfServices(serviceList.getLength());
        data.setNumberOfBroadcastReceivers(receiverList.getLength());
        data.setNumberOfContentProviders(providerList.getLength());
    }

    private void getUsedPermissions() {
        NodeList usesPermissionList = doc.getElementsByTagName("uses-permission");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < usesPermissionList.getLength(); i++) {
            Node nNode = usesPermissionList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                result.add(eElement.getAttribute("android:name"));
            }
        }
        data.setUsesPermissions(result);
    }

    private void getUsedLibraries() {
        NodeList usesLibraryList = doc.getElementsByTagName("uses-library");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < usesLibraryList.getLength(); i++) {
            Node nNode = usesLibraryList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                result.add(eElement.getAttribute("android:name"));
            }
        }
        data.setUsesLibrary(result);
    }

    private void getUsedFeatures() {
        NodeList usesLibraryList = doc.getElementsByTagName("uses-feature");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < usesLibraryList.getLength(); i++) {
            Node nNode = usesLibraryList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                result.add(eElement.getAttribute("android:name"));
            }
        }
        data.setUsesFeature(result);
    }

}
