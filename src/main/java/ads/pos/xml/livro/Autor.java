package ads.pos.xml.livro;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/09/2017, 22:33:40
 */
@XmlType(propOrder = {"nome", "nascimento"})
public class Autor {

    private String nome;
    private String nascimento;

    public Autor() {
    }

    public Autor(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", nascimento=" + nascimento + '}';
    }

}
