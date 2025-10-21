
package Ecommerce;

/**
 *
 * @author luisd
 */
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public double calcularTotal() {
        return precio;
    }
    
}
