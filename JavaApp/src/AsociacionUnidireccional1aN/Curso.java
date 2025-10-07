
package AsociacionUnidireccional1aN;

/**
 *
 * @author luisd
 */
public class Curso {
    private String nombre;
    private int creditos;
        //Constructor

    public Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
        //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }
    
}
