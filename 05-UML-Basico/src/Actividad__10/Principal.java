
package Actividad__10;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("Luis", "54000123");
        CuentaBancaria CB = new CuentaBancaria("1231245123", 200.50 , "HsEd123");
        CB.setTitular(titular);
        
        System.out.println(CB);
    }
    
}
