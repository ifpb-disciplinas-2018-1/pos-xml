package ads.pos.xml.funcionario.parser;

import ads.pos.xml.funcionario.Funcionario;
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
 * @since 07/09/2017, 22:29:23
 */
public class ParserJAXB implements ParserXML {

    @Override
    public void toObject() {
        try {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ads/pos/xml/funcionario/source/funcionario.xsd"));

            File file = new File("src/main/java/ads/pos/xml/funcionario/source/funcionario.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Funcionario.class);
            Unmarshaller marshaller = jaxbContext.createUnmarshaller();
            marshaller.setSchema(schema);

            Funcionario funcionario = (Funcionario) marshaller.unmarshal(file);
            System.out.println(funcionario);
        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void toXML(Funcionario funcionario) {
        try {

            File file = new File("src/main/java/ads/pos/xml/funcionario/parser/file_output.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Funcionario.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.w3schools.com funcionario.xsd");

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/java/ads/pos/xml/funcionario/source/funcionario.xsd"));
            marshaller.setSchema(schema);

            marshaller.marshal(funcionario, file);
            marshaller.marshal(funcionario, System.out);

        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
