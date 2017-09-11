package ads.pos.xml.client;

import ads.pos.xml.Livro;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 11/09/2017, 14:01:14
 */
public interface ParserXML {

    public void toXML(Livro livro);

    public void toObject();

}
