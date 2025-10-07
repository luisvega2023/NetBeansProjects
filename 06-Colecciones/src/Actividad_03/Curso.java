
package Actividad_03;

/**
 *
 * @author luisd
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    //CONTRUCTOR
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    // SETTERS Y GETTERS
    public void setProfesor(Profesor profesor){
        if (this.profesor == profesor) return;
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;
        if(profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    /**
     * Metodo que muestra la informacion de un curso.
     */
    public void mostrarInfo(){
        System.out.println("El Curso "+ nombre +" tiene el profesor:\nNombre: " + this.profesor.getNombre() + "\nProfesion: " + this.profesor.getEspecialidad()+"\nID: " + this.profesor.getId() );
    }
    
}
