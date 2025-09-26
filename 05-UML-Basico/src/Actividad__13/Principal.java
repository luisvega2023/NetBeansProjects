
package Actividad__13;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Usuario user = new Usuario("Luis", "Vegaluis@gmail.com");
       GeneradorQR QR = new GeneradorQR();
       
       QR.generar(100, user);
       
    }
    
}
