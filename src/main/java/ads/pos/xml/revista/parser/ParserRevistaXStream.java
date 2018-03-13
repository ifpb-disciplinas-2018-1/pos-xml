package ads.pos.xml.revista.parser;

import ads.pos.xml.revista.Revista;
import com.thoughtworks.xstream.XStream;
import java.io.File;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2018, 14:44:47
 */
public class ParserRevistaXStream implements ParserXML<Revista> {

    @Override
    public String toXML(Revista object) {
        XStream xStream = new XStream();
        xStream.alias("revista", Revista.class);
        return xStream.toXML(object);
    }

    @Override
    public Revista toObject(File xml) {
        XStream xStream = new XStream();
        xStream.alias("revista", Revista.class);
        return (Revista) xStream.fromXML(xml);
    }

}
