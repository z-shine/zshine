package principle.factorymethod.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLReader
{
    public static Object getObject()
    {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docBuilder = dFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(XMLReader.class.getResource("/config1.xml").getPath()));
            NodeList nodeList = doc.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            Class<?> clazz = Class.forName("principle.factorymethod.impl." + node.getNodeValue());
            return clazz.newInstance();
        } catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
