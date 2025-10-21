
package Ecommerce;

/**
 *
 * @author luisd
 */
public class TarjetaCredito implements PagoConDescuento{

    @Override
    public double aplicarDescuento(double monto){
        return monto - monto * 0.10; //10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con tarjeta: $" + monto);
    }
    
}
