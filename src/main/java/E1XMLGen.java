import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

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

            doc.getDocumentElement().appendChild(asignatura0);
            doc.getDocumentElement().appendChild(asignatura1);

            // L2
            Element bibliografia0 = doc.createElement("bibliografia");
            Element bibliografia1 = doc.createElement("bibliografia");
            Element alumnos0 = doc.createElement("alumnos");
            Element alumnos1 = doc.createElement("alumnos");

            asignatura0.appendChild(bibliografia0);
            asignatura1.appendChild(bibliografia1);
            asignatura0.appendChild(alumnos0);
            asignatura1.appendChild(alumnos1);

            // L3
            Element libro0_0 = doc.createElement("libro");
            Element libro0_1 = doc.createElement("libro");
            Element libro1_0 = doc.createElement("libro");
            Element libro1_1 = doc.createElement("libro");
            Element alumno0 = doc.createElement("alumno");
            Element alumno1 = doc.createElement("alumno");

            Attr l0_e0 = doc.createAttribute("id");
            Attr l0_e1 = doc.createAttribute("id");
            Attr l1_e0 = doc.createAttribute("id");
            Attr l1_e1 = doc.createAttribute("id");
            Attr al0 = doc.createAttribute("id");
            Attr al1 = doc.createAttribute("id");
            l0_e0.setValue("l1_psp");
            l0_e1.setValue("l2_psp");
            l1_e0.setValue("l1_ad");
            l1_e1.setValue("l2_ad");
            al0.setValue("a1");
            al1.setValue("a2");
            libro0_0.appendChild(doc.createTextNode("PSP libro1"));
            libro0_1.appendChild(doc.createTextNode("PSP libro2"));
            libro1_0.appendChild(doc.createTextNode("AD libro1"));
            libro1_1.appendChild(doc.createTextNode("AD libro2"));
            libro0_0.setAttributeNode(l0_e0);
            libro0_1.setAttributeNode(l0_e1);
            libro1_0.setAttributeNode(l1_e0);
            libro1_1.setAttributeNode(l1_e1);
            alumno0.setAttributeNode(al0);
            alumno1.setAttributeNode(al1);

            bibliografia0.appendChild(libro0_0);
            bibliografia0.appendChild(libro0_1);
            bibliografia0.appendChild(libro1_0);
            bibliografia0.appendChild(libro1_1);
            alumnos0.appendChild(alumno0);
            alumnos1.appendChild(alumno1);

            // L4
            Element nombre0 = doc.createElement("nombre");
            Element nombre1 = doc.createElement("nombre");

            nombre0.appendChild(doc.createTextNode("Carlos Saenz Adan"));
            nombre1.appendChild(doc.createTextNode("Pedro García Martínez"));

            alumno0.appendChild(nombre0);
            alumno1.appendChild(nombre1);

            // LX
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource doms = new DOMSource(doc);

            StreamResult result = new StreamResult(new File("profesor.xml"));
            t.transform(doms, result);

            StreamResult cr = new StreamResult(System.out);
            t.transform(doms, cr);
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
