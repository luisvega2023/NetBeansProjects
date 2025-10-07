
package Actividad_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();
    
    //CONTRUCTOR
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }
    /**
     * Metodo que agrega un curso a la lista de cursos, este verifica que el curso no sea null y que el arraylist no lo contenga, 
     * despues verifica que el profesor no sea el mismo de la instancia y lo agrega al curso.
     * @param curso instancia de la clase Curso.
     */
    public void agregarCurso( Curso curso){
        if(curso != null && !cursos.contains(curso)){
            cursos.add(curso);
            if (curso.getProfesor() != this){
                curso.setProfesor(this);
            }
        }
    }
    /**
     * Metodo que elimina un curso de la lista cursos, verifica que se elimino y deja a profesor en null.
     * @param c instancia de la clase Curso.
     */
    public void eliminarCurso( Curso c){
        if(cursos.remove(c) && c.getProfesor() == this){
            c.setProfesor(null);
        }
    }
    /**
     * Metodo que lista los curso de la ArrayList cursos.
     */
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    /**
     * Metodo que muestra la informacion de un profesor y la cantidad de cursos que tiene.
     */
    public void mostrarInfo(){
        int cont = 0;
        for (Curso curso : cursos) {
            cont += 1;
        }
        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad + "\nCantidad de cursos: " + cont);
    }
    //GETTERS 
    public List<Curso> getCursos() {
        return cursos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    
}
