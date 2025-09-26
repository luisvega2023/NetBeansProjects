
package Actividad_5;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Luis", "40123156");
        Computadora computadora = new Computadora("MSI", "B650M", "Ryzen", "5 7600");
        computadora.SetPropietario(propietario);
        
        System.out.println(computadora);
    }
    
}
