
package Ecommerce;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear productos
        Producto p1 = new Producto("Laptop", 1200.0);
        Producto p2 = new Producto("Mouse", 25.0);

        // Crear cliente
        Cliente cliente = new Cliente("Luis Fernando");

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarPedido(p1);
        pedido.agregarPedido(p2);
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Cambiar estado del pedido
        pedido.cambiarEstado("En preparación");

        // Procesar pago con descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        System.out.println("Total con descuento: $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);

    }
    
}
