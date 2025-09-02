
package pkg3;

/**
 *
 * @author luisd
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    //SETTER
    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio > 0){//condicional que valida si el dato ingresado es mayor a 0.
           anioPublicacion = nuevoAnio;
        }
        
    }
    
}
