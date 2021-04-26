import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class E1XMLGen {
    public void generateXML() {
        try {
            // L0
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            DOMImplementation domi = db.getDOMImplementation();
            Document doc = domi.createDocument(null, "profesor", null);

            // L1
            Element asignatura0 = doc.createElement("asignatura");
            Element asignatura1 = doc.createElement("asignatura");
            doc.getDocumentElement().appendChild(asignatura0);
            doc.getDocumentElement().appendChild(asignatura1);

            Attr e0a0 = doc.createAttribute("nombre");
            Attr e0a1 = doc.createAttribute("abreviatura");
            Attr e1a0 = doc.createAttribute("nombre");
            Attr e1a1 = doc.createAttribute("abreviatura");
            e0a0.setValue("Programación de servicios y procesos");
            e0a1.setValue("PSP");
            e1a0.setValue("Acceso a datos");
            e1a1.setValue("AD");

            asignatura0.setAttributeNode(e0a0);
            asignatura0.setAttributeNode(e0a1);
            asignatura1.setAttributeNode(e1a0);
            asignatura1.setAttributeNode(e1a1);

            // L2

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
