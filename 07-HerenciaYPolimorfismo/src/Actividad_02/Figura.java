
package Actividad_02;

/**
 *
 * @author luisd
 */
public abstract class Figura {
    private String nombre;
    //CONTRUCTOR
    public Figura(String nombre) {
        this.nombre = nombre;
    } 
    //GETTER
    public String getNombre() {
        return nombre;
    }
    //METODO ABSTRACT
    public abstract double calcularArea();
    
}
