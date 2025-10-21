
package Ecommerce;

import java.util.ArrayList;

/**
 *
 * @author luisd
 */
public class Pedido implements Pagable {
    
    private Cliente cliente;
    ArrayList<Producto> productos;

    //CONTRUCTOR
    public Pedido(Cliente cliente) {
       this.cliente = cliente;
       this.productos = new ArrayList<>();
    }
    
    public void cambiarEstado(String nuevoEstado) {
        cliente.notificar("El estado del pedido cambió a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        int cont = 0;
        for (Producto producto : productos) {
            cont += producto.getPrecio();
        }
        return cont;
    }
    
    public void agregarPedido(Producto e){
        this.productos.add(e);
    }
    
}
