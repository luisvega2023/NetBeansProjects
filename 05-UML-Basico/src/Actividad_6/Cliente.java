
package Actividad_6;

/**
 *
 * @author luisd
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private Reserva reserva;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
