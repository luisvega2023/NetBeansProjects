
package Actividad_3;

/**
 * 
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Autor autor = new Autor("Luis", "Argentina");
        Editorial editorial = new Editorial("La Nueva Edit.", "Juan Justo 333");
        Libro libro = new Libro("Programacion 2", "1234567891000", editorial);
        libro.setAutor(autor);
        System.out.println(libro);
    }
    
}
