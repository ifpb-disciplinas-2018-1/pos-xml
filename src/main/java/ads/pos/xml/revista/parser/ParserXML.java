package ads.pos.xml.revista.parser;

import java.io.File;

/**
 * @author Ricardo Job
 * @param <T>
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2018, 14:43:34
 */
public interface ParserXML<T> {

    public String toXML(T object);

    public T toObject(File xml);
}
