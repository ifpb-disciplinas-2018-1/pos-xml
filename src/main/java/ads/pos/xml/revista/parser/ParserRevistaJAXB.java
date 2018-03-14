package ads.pos.xml.revista.parser;

import ads.pos.xml.revista.Revista;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2018, 14:44:47
 */
public class ParserRevistaJAXB implements ParserXML<Revista> {

    @Override
    public String toXML(Revista object) {
        try {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ads/pos/xml/revista/source/revista.xsd"));

            JAXBContext jaxbContext = JAXBContext.newInstance(Revista.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.w3schools.com revista.xsd");
            
            marshaller.setSchema(schema);
            marshaller.marshal(object, System.out);
            return "";
        } catch (JAXBException | SAXException ex) {
            Logger.getLogger(ParserRevistaJAXB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public Revista toObject(File xml) {
        try {
//            File file = new File("src/main/java/ads/pos/xml/revista/revista.xml");
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ads/pos/xml/revista/source/revista.xsd"));

            JAXBContext jaxbContext = JAXBContext.newInstance(Revista.class);
            Unmarshaller marshaller = jaxbContext.createUnmarshaller();
            
            marshaller.setSchema(schema);
            Revista revista = (Revista) marshaller.unmarshal(xml);
            return revista;
        } catch (JAXBException | SAXException ex) {
            Logger.getLogger(ParserRevistaJAXB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
