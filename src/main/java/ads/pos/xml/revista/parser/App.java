package ads.pos.xml.revista.parser;

import ads.pos.xml.revista.Revista;
import java.io.File;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2018, 14:46:24
 */
public class App {

    public static void main(String[] args) {
//        ParserXML<Revista> parser = new ParserRevistaXStream();
        ParserXML<Revista> parser = new ParserRevistaJAXB();
        Revista revista = new Revista("oi", 1988, "1231-1321-1321");
        String toXML = parser.toXML(revista);
        System.out.println(toXML);

//        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
//                + "<revista \n"
//                + "    xmlns=\"http://www.w3schools.com\"\n"
//                + "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
//                + "    xsi:schemaLocation=\"http://www.w3schools.com revista.xsd\">\n"
//                + "    <titulo>Java como Programar</titulo>\n"
//                + "    <ISBN>543333-3532</ISBN>\n"
//                + "    <ano>1980</ano>\n"
//                + "</revista>\n";
        File xml = new File("src/main/java/ads/pos/xml/revista/source/revista.xml");
        Revista retorno = parser.toObject(xml);
        System.out.println(retorno);
    }
}
