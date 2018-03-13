package ads.pos.xml.livro.parser;

import ads.pos.xml.livro.Livro;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 11/09/2017, 14:01:14
 */
public interface ParserXML {

    public void toXML(Livro livro);

    public void toObject();

}
