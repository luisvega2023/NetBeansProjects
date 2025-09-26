
package Actividad__10;

/**
 *
 * @author luisd
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria CB;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    public void setCuentaBancaria( CuentaBancaria CB){
        this.CB = CB;
        if( CB != null && CB.getTitular() != this){
            CB.setTitular(this);
        }
    }
    public CuentaBancaria getCuentaBancaria(){
        return CB;
    }
    
    
}
