
package Actividad_03;

/**
 *
 * @author luisd
 */
public abstract class Empleado {
    private String nombre;
    
    //CONTRUCTOR
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //GETTER
    public String getNombre() {
        return nombre;
    }
    //METODO ABSTRACT
    public abstract int calcularSueldo();
    
}
