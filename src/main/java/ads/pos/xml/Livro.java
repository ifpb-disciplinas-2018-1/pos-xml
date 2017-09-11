package ads.pos.xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 10/09/2017, 22:32:14
 */
@XmlType(propOrder = {"titulo", "autor", "data", "ISBN", "editora"})
@XmlRootElement(name = "livro")
public class Livro {

    private String titulo;
    private String ISBN;
    private String editora;
    private String data;
    private Autor autor;

    public Livro() {
    }

    public Livro(String titulo, String ISBN, String editora, String data, Autor autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
        this.data = data;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", editora=" + editora + ", data=" + data + ", autor=" + autor + '}';
    }

}
