package ads.pos.xml.funcionario.parser;

import ads.pos.xml.funcionario.Dependente;
import ads.pos.xml.funcionario.Endereco;
import ads.pos.xml.funcionario.Funcionario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 11/09/2017, 14:02:13
 */
public class Loader {

    public static void main(String[] args) {
      
        Dependente dependente = new Dependente(1l, "Kiko","22/10/2003");
        Dependente dependente2 = new Dependente(2l, "Chaves","11/09/2000");
        Endereco endereco = new Endereco(1l, "Rua das Flores", "Jardin", "Vale Verde", "Paraiba", 30);
        List<Dependente> lista = new ArrayList<>();
        lista.add(dependente);
        lista.add(dependente2);

        Funcionario funcionario = new Funcionario(1l, "Sr Madruga", "9999-6543", "madruga@gmail.com", endereco, lista);
        ParserXML parser = new ParserJAXB();
//        ParserXML parser = new ParserXstream();
        parser.toXML(funcionario);
        parser.toObject();
    }

}
