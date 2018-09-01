package ads.pos.xml.funcionario;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id","nome", "nascimento"})
public class Dependente {
    private Long id;
     private String nome;
     private String nascimento;

    public Dependente() {
    }

    public Dependente(Long id, String nome, String nascimento) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Dependente{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + '}';
    }
     
}
