
package Actividad_02;

/**
 *
 * @author luisd
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    //CONTRUCTOR
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    /**
     * metodo que muestra la informacion de una instancia autor.
     */
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Nacionalidad: " + nacionalidad);
    }
}
