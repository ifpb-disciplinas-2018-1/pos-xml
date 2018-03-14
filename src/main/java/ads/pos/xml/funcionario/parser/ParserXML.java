package ads.pos.xml.funcionario.parser;

import ads.pos.xml.funcionario.Funcionario;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 11/09/2017, 14:01:14
 */
public interface ParserXML {

    public void toXML(Funcionario funcionario);

    public void toObject();

}
