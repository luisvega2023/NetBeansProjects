
package Actividad_3;

/**
 *
 * @author luisd
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + '}';
    }

    
    
    
}
