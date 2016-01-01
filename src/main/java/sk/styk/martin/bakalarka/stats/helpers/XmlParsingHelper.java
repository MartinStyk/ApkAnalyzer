package sk.styk.martin.bakalarka.stats.helpers;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 07.12.2015.
 */
public class XmlParsingHelper {

    private static final Logger logger = Logger.getLogger(XmlParsingHelper.class);

    public static Document getNormalizedDocument(File manifestFile) throws ParserConfigurationException, IOException, SAXException {

        logger.trace("started parsing of manifest file");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(manifestFile);

        doc.getDocumentElement().normalize();

        logger.trace("finished parsing of manifest file");

        return doc;
    }

    public static Element getSingleAppearingElementByTag(Document document, String tag) {
        NodeList elementList = document.getElementsByTagName(tag);
        if (elementList.getLength() != 1)
            return null;

        Node nNode = elementList.item(0);
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            return (Element) nNode;
        }
        return null;
    }

    public static Boolean getBooleanElementAtribute(Element eElement, String atribute) {
        String atr = eElement.getAttribute(atribute);
        if (atr != null && !atr.isEmpty()) {
            return Boolean.valueOf(atr);
        }
        return null;
    }

    public static List<String> getListOfTagAttributeValues(Document document, String elementTag, String attributeName) {
        NodeList usesPermissionList = document.getElementsByTagName(elementTag);

        List<String> result = new ArrayList<String>();
        for (int i = 0; i < usesPermissionList.getLength(); i++) {
            Node nNode = usesPermissionList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String value = eElement.getAttribute(attributeName);
                if (value != null && !value.isEmpty()) {
                    result.add(value);
                }
            }
        }
        return result;
    }

    public static String getSingleNonEmptyStringAtributeFromElement(Element element, String atrName) {
        String atrValue = element.getAttribute(atrName);
        return atrValue.isEmpty() ? null : atrValue;
    }
}
