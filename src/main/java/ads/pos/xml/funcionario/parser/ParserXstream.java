package ads.pos.xml.funcionario.parser;

import ads.pos.xml.funcionario.Dependente;
import ads.pos.xml.funcionario.Endereco;
import ads.pos.xml.funcionario.Funcionario;
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
        this.stream.alias("funcionario", Funcionario.class);
        this.stream.alias("endereco", Endereco.class);
        this.stream.alias("dependente", Dependente.class);
    }

    public void toObject() {
        File file = new File("src/main/java/ads/pos/xml/funcionario/source/funcionario.xml");
        Funcionario funcionario = (Funcionario) stream.fromXML(file);
        System.out.println("funcionario = " + funcionario);
    }

    public void toXML(Funcionario funcionario) {
        String toXML = stream.toXML(funcionario);
        System.out.println(toXML);
    }
}
