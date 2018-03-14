package ads.pos.xml.livro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/09/2017, 22:33:40
 */
@XmlType(propOrder = {"nome", "nascimento", "telefone", "sexo"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Autor {

    @XmlAttribute
    private int id;
    private String nome;
    private String nascimento;
    private String telefone;
    private Sexo sexo;

    public Autor() {
    }

    public Autor(int id, String nome, String nascimento, String telefone, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.sexo = sexo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", telefone=" + telefone + ", sexo=" + sexo + '}';
    }

    

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public enum Sexo{
        HOMEM,
        MULHER
    }

}
