import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SampleXML2 {
    private static final String FILENAME = "D:\\staff.xml";

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // get <staff>
            NodeList list = doc.getElementsByTagName("JOB");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    // get staff's attribute
                    String id = element.getAttribute("id");
                    String type = element.getAttribute("type");

                    NodeList varibleNodeList = element.getElementsByTagName("varible");

                    String value_FTPRP1 = varibleNodeList.item(1).getAttributes().getNamedItem("value")
                            .getTextContent();
                    String value_FTPLP2 = varibleNodeList.item(2).getAttributes().getNamedItem("value")
                            .getTextContent();

                    // System.out.println("Current Element :" + node.getNodeName());
                    // System.out.println("JOB ID : " + id);
                    // System.out.println("%%FTP-RP1 : "+ value_FTPRP1);
                    // System.out.println("%%FTP-LP2 : "+ value_FTPLP2);
                    // System.out.println("==================================");

                    // ksksksksksk

                    System.out.print(id+",");
                    System.out.print(value_FTPRP1+",");
                    System.out.print(value_FTPLP2);
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
