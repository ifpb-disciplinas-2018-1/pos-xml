package ads.pos.xml.livro.parser;

import ads.pos.xml.livro.Autor;
import ads.pos.xml.livro.Livro;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 11/09/2017, 14:02:13
 */
public class Loader {

    public static void main(String[] args) {

        String data = "12/12/2016";
        Autor autor = new Autor(1, "Chiquinha", data, "3531-2123", Autor.Sexo.MULHER);
        Livro livro = new Livro("a", "123-123", "ADS", data, autor);

//        ParserXML parser = new ParserJAXB();
        ParserXML parser = new ParserXstream();
        parser.toXML(livro);
        parser.toObject();
    }

}
