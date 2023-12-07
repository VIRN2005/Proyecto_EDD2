package proyecto_edd2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.*;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Text;

/**
 *
 * @author Victor
 */
public class Export_XML {

    //Doc Factories
    public DocumentBuilderFactory dbFactory;
    public DocumentBuilder dbBuilder;
    public Document doc;
    public Element elementRoot, col, val;

    public Export_XML() {

    }

    /*public void CreateXML(String path, String name, ArrayList<Campo> key, ArrayList<Registro> value) throws Exception {
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            dbBuilder = dbFactory.newDocumentBuilder();
            DOMImplementation implementation = dbBuilder.getDOMImplementation();
            Document document = implementation.createDocument(null, name, null);
            document.setXmlVersion("1.0");

            Element rootElement = document.getDocumentElement();
            org.w3c.dom.Node node = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"XSML.xsl\"");
            document.insertBefore(node, rootElement);

            for (Registro registro : value) {
                Element registerElement = document.createElement("REGISTER");

                for (int i = 0; i < key.size(); i++) {
                    Element campElement = document.createElement("CAMP");
                    campElement.appendChild(document.createTextNode(key.get(i).getName()));
                    registerElement.appendChild(campElement);

                    Element typeElement = document.createElement("TYPE");
                    String typeValue = key.get(i).getType(); // Bello el Method de Andrea
                    typeElement.appendChild(document.createTextNode(typeValue));
                    registerElement.appendChild(typeElement);

                    Element valueElement = document.createElement("VALUE");
                    valueElement.appendChild(document.createTextNode(registro.getAll_fields().get(i)));
                    registerElement.appendChild(valueElement);
                }

                rootElement.appendChild(registerElement);
            }

            Source source = new DOMSource(document);
            System.out.println("NAME: " + path);
            File xmlFile = new File(path + "/" + name + ".xml");
            Result result = new StreamResult(xmlFile);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

            Path origin = Paths.get("XMLSc.xsl");
            Path destination = Paths.get(path + "/XSML.xsl");
            Files.copy(origin, destination, StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    public void CreateXML(String path, String name, ArrayList<Campo> key, ArrayList<Registro> value) throws Exception {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            DOMImplementation implementation = dbBuilder.getDOMImplementation();
            Document document = implementation.createDocument(null, name, null);
            document.setXmlVersion("1.0");

            Element rootElement = document.getDocumentElement();
            org.w3c.dom.Node node = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"XSML.xsl\"");
            document.insertBefore(node, rootElement);

            for (int j = 0; j < value.size(); j++) {
                Element itemNode = document.createElement("REGISTER");
                for (int i = 0; i < key.size(); i++) {
                    Element CampNode = document.createElement("CAMP");
                    Text nodeCampoValue = document.createTextNode(key.get(i).getName());
                    CampNode.appendChild(nodeCampoValue);
                    itemNode.appendChild(CampNode);

                    Element TypeNode = document.createElement("TYPE");
                    Text nodeTypeValue;
                    if (key.get(i).isIsChar()) {
                        nodeTypeValue = document.createTextNode("Char");
                    } else {
                        nodeTypeValue = document.createTextNode("Integer");
                    }
                    TypeNode.appendChild(nodeTypeValue);
                    itemNode.appendChild(TypeNode);

                    Element valueNode = document.createElement("VALUE");
                    Text nodeValueValue = document.createTextNode(value.get(j).getAll_fields().get(i));
                    valueNode.appendChild(nodeValueValue);
                    itemNode.appendChild(valueNode);

                    rootElement.appendChild(itemNode);
                }
            }

            Source source = new DOMSource(document);
            System.out.println("NAME: " + path);
            File xmlFile = new File(path + "/" + name + ".xml");
            Result result = new StreamResult(xmlFile);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

            Path origin = Paths.get("XMLSc.xsl");
            Path destination = Paths.get(path + "/XSML.xsl");
            Files.copy(origin, destination, StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
