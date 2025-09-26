
package Actividad__12;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Contribuyente contri = new Contribuyente("Luis", "20-4012123");
        Impuesto impuesto = new Impuesto(20000.50);
        
        impuesto.setContribuyente(contri);
        calculadora.calcular(impuesto);
                
        System.out.println(impuesto);
    }
    
}
