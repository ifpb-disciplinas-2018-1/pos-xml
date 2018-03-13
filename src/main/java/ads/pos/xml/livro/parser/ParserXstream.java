package ads.pos.xml.livro.parser;

import ads.pos.xml.livro.Autor;
import ads.pos.xml.livro.Livro;
import com.thoughtworks.xstream.XStream;
import java.io.File;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/09/2017, 22:29:15
 */
public class ParserXstream implements ParserXML {

    private final XStream stream;

    public ParserXstream() {
        this.stream = new XStream();
        this.stream.alias("livro", Livro.class);
        this.stream.alias("autor", Autor.class);
    }

    public void toObject() {
        File file = new File("src/main/java/ads/pos/xml/livro/source/livro.xml");
        Livro livro = (Livro) stream.fromXML(file);
        System.out.println("livro = " + livro);
    }

    public void toXML(Livro livro) {
        String toXML = stream.toXML(livro);
        System.out.println(toXML);
    }
}
