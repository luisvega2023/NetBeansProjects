
package Actividad_8;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Luis", "VegaLuis@gmail.com");
        FirmaDigital FD = new FirmaDigital("342hjg224h", "2'/09/2025", usuario, "DNI", "informacion");
        
        System.out.println(FD);
    }
    
}
