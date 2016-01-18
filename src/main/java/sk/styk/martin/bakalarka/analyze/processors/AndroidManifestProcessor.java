package sk.styk.martin.bakalarka.analyze.processors;

import fr.xgouchet.axml.CompressedXmlParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.processors.helpers.XmlParsingHelper;
import sk.styk.martin.bakalarka.files.ApkFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Martin Styk on 25.11.2015.
 */
public class AndroidManifestProcessor {

    private static final Logger logger = LoggerFactory.getLogger(AndroidManifestProcessor.class);
    private Marker apkNameMarker;
    private Document document;
    private ApkData data;
    private File manifestFile;
    private AndroidManifestData manifestData;
    private ApkFile apkFile;

    public AndroidManifestProcessor(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = data;
        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public AndroidManifestProcessor(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = null;
        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public static AndroidManifestProcessor getInstance(ApkData data, ApkFile apkFile) {
        return new AndroidManifestProcessor(data, apkFile);
    }

    public static AndroidManifestProcessor getInstance(ApkFile apkFile) {
        return new AndroidManifestProcessor(apkFile);
    }

    public AndroidManifestData processAndroidManifest() {

        logger.trace(apkNameMarker + "Started processing AndroidManifest");

        manifestData = new AndroidManifestData();

        boolean isSuccessXmlDecompress = processUsingXmlDecompress();
        boolean isSuccessDecompilation = false;
        if (!isSuccessXmlDecompress) {
            isSuccessDecompilation = processUsingDecompilation();
        }

        if(!isSuccessDecompilation && !isSuccessXmlDecompress){
            manifestData = null;
        }

        if (data != null) {
            data.setAndroidManifest(manifestData);
        }

        logger.trace(apkNameMarker + "Finished processing of AndroidManifest");

        return manifestData;
    }

    private boolean processUsingXmlDecompress() {

        boolean isSuccess;
        InputStream manifestStream = null;
        logger.trace(apkNameMarker + "Using XML decompress method");

        try {

            manifestFile = new File(apkFile.getUnzipDirectoryWithUnzipedData(), "AndroidManifest.xml");
            manifestStream = new FileInputStream(manifestFile);
            document = new CompressedXmlParser().parseDOM(manifestStream);
            document.getDocumentElement().normalize();

            getManifestTagData();
            getAppComponents();
            getUsedPermissions();
            getUsedLibraries();
            getUsedFeatures();
            getUsesSdk();
            getSupportScreens();

            isSuccess = true;

        } catch (Exception e) {
            logger.error(apkNameMarker + e.toString());
            isSuccess = false;
        } finally {
            document = null;
            try {
                manifestStream.close();
            } catch (Exception e) {
                logger.warn(e.toString());
            }
        }
        return isSuccess;
    }

    private boolean processUsingDecompilation() {

        boolean isSuccess;

        logger.trace(apkNameMarker + "Using Apktool decompilation method");

        try {

            manifestFile = new File(apkFile.getDecompiledDirectoryWithDecompiledData(), "AndroidManifest.xml");
            document = XmlParsingHelper.getNormalizedDocument(manifestFile);

            getManifestTagData();
            getAppComponents();
            getUsedPermissions();
            getUsedLibraries();
            getUsedFeatures();
            getUsesSdk();
            getSupportScreens();

            isSuccess = true;

        } catch (Exception e) {
            logger.error(apkNameMarker + e.toString());
            isSuccess = false;
        } finally {
            document = null;
        }
        return isSuccess;
    }

    private void getManifestTagData() {
        Element element = XmlParsingHelper.getSingleAppearingElementByTag(document, "manifest");
        if (element != null) {
            manifestData.setPackageName(XmlParsingHelper.getSingleNonEmptyStringAtributeFromElement(element, "package"));
            manifestData.setVersionCode(XmlParsingHelper.getSingleNonEmptyStringAtributeFromElement(element, "android:versionCode"));

            String installLocation = XmlParsingHelper.getSingleNonEmptyStringAtributeFromElement(element, "android:installLocation");
            if (installLocation != null) {
                if (installLocation.equalsIgnoreCase("0")) {
                    manifestData.setInstallLocation("auto");
                } else if (installLocation.equalsIgnoreCase("1")) {
                    manifestData.setInstallLocation("internalOnly");
                } else if (installLocation.equalsIgnoreCase("2")) {
                    manifestData.setInstallLocation("preferExternal");
                } else {
                    manifestData.setInstallLocation(installLocation);
                }
            }
        }
    }

    private void getAppComponents() {
        List<String> activityList = XmlParsingHelper.getListOfTagAttributeValues(document, "activity", "android:name");
        List<String> serviceList = XmlParsingHelper.getListOfTagAttributeValues(document, "service", "android:name");
        List<String> receiverList = XmlParsingHelper.getListOfTagAttributeValues(document, "receiver", "android:name");
        List<String> providerList = XmlParsingHelper.getListOfTagAttributeValues(document, "provider", "android:name");

        manifestData.setNumberOfActivities(activityList.size());
        manifestData.setNumberOfServices(serviceList.size());
        manifestData.setNumberOfBroadcastReceivers(receiverList.size());
        manifestData.setNumberOfContentProviders(providerList.size());

        manifestData.setNamesOfActivities(activityList);
        manifestData.setNamesOfServices(serviceList);
        manifestData.setNamesOfBroadcastReceivers(receiverList);
        manifestData.setNamesOfContentProviders(providerList);
    }

    private void getUsedPermissions() {
        List<String> result = XmlParsingHelper.getListOfTagAttributeValues(document, "uses-permission", "android:name");
        manifestData.setUsesPermissions(result);
    }

    private void getUsedLibraries() {
        List<String> result = XmlParsingHelper.getListOfTagAttributeValues(document, "uses-library", "android:name");
        manifestData.setUsesLibrary(result);
    }

    private void getUsedFeatures() {
        List<String> result = XmlParsingHelper.getListOfTagAttributeValues(document, "uses-feature", "android:name");
        manifestData.setUsesFeature(result);
    }

    private void getUsesSdk() {
        Element element = XmlParsingHelper.getSingleAppearingElementByTag(document, "uses-sdk");

        if (element != null) {
            manifestData.setUsesTargetSdkVersion(element.getAttribute("android:targetSdkVersion"));
            manifestData.setUsesMinSdkVersion(element.getAttribute("android:minSdkVersion"));
            manifestData.setUsesMaxSdkVersion(element.getAttribute("android:maxSdkVersion"));
        }
    }

    private void getSupportScreens() {
        Element element = XmlParsingHelper.getSingleAppearingElementByTag(document, "supports-screens");

        if (element != null) {
            manifestData.setSupportsScreensResizeable(XmlParsingHelper.getBooleanElementAtribute(element, "android:resizeable"));
            manifestData.setSupportsScreensAnyDensity(XmlParsingHelper.getBooleanElementAtribute(element, "android:anyDensity"));
            manifestData.setSupportsScreensSmall(XmlParsingHelper.getBooleanElementAtribute(element, "android:smallScreens"));
            manifestData.setSupportsScreensNormal(XmlParsingHelper.getBooleanElementAtribute(element, "android:normalScreens"));
            manifestData.setSupportsScreensLarge(XmlParsingHelper.getBooleanElementAtribute(element, "android:largeScreens"));
            manifestData.setSupportsScreensXlarge(XmlParsingHelper.getBooleanElementAtribute(element, "android:xlargeScreens"));
        }
    }

}
