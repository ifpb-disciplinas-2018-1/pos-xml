package ads.pos.xml.revista;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/03/2018, 14:42:01
 */
@XmlRootElement
@XmlType(propOrder = {"titulo", "ISBN", "ano"})
public class Revista implements Serializable {

    private String titulo;
    private int ano;
    private String ISBN;

    public Revista() {
    }

    public Revista(String titulo, int ano, String ISBN) {
        this.titulo = titulo;
        this.ano = ano;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Revista{" + "titulo=" + titulo + ", ano=" + ano + ", ISBN=" + ISBN + '}';
    }
}
