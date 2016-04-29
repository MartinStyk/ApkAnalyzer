package sk.styk.martin.bakalarka.analyze.processors.helpers;

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
 * Utils for simplified XML parsing
 *
 * Created by Martin Styk on 07.12.2015.
 */
public class XmlParsingHelper {

    private static final Logger logger = Logger.getLogger(XmlParsingHelper.class);

    /**
     * Create normalized XML document
     *
     * @param manifestFile XML file to work with
     * @return normalized XML org.w3c.dom.Document
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static Document getNormalizedDocument(File manifestFile) throws ParserConfigurationException, IOException, SAXException {

        logger.trace("started parsing of manifest file");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(manifestFile);

        doc.getDocumentElement().normalize();

        logger.trace("finished parsing of manifest file");

        return doc;
    }

    /**
     * Get Element by according tag
     * Only one such element should exist
     *
     * @param document document to search
     * @param tag tag to look for in document
     * @return corresponding element
     */
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

    /**
     * @param eElement element containing boolean attribute
     * @param atribute name of attribute in element
     * @return value of boolean or null if attribute not exists
     */
    public static Boolean getBooleanElementAtribute(Element eElement, String atribute) {
        String atr = eElement.getAttribute(atribute);
        if (atr != null && !atr.isEmpty()) {
            return Boolean.valueOf(atr);
        }
        return null;
    }

    /**
     * Return all values associated with attributeName inside element specified by tag
     * @param document doc we work with
     * @param elementTag element containing desired attribute
     * @param attributeName name of attribute
     * @return List of values specified in XML array
     */
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

    /**
     * @param element
     * @param atrName
     * @return String attribute or nul if not defined or empty
     */
    public static String getSingleNonEmptyStringAtributeFromElement(Element element, String atrName) {
        String atrValue = element.getAttribute(atrName);
        return atrValue.isEmpty() ? null : atrValue;
    }
}
