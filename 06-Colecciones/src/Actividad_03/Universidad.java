
package Actividad_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesor;
    private List<Curso> cursos;
    
    //CONTRUCTOR
    public Universidad(String nombre) {
        this.nombre = nombre;
        profesor = new ArrayList<>();
        cursos = new ArrayList<>();
    }
    
    /**
     * Metodo que agrega un profesor al ArrayList profesor.
     * @param p instancia de la clase Profesor.
     */
    public void agregarProfesor(Profesor p){
        profesor.add(p);
    }
    /**
     * Metodo que agrega un curso al ArrayList Curso.
     * @param c instancia de la clase Curso.
     */
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
    /**
     * Metodo que asigna un profesor a un curso, este busca por id al profesor con el metodo buscarProfesorPorId()
     * y el curso por el codigo, con el metodo buscarCursoPorCodigo(), luego verifica que lo encontrado no sea null y
     * asigna el profesor al curso.
     * @param codigoCurso codigo que hace referencia al atributo codigo de la clase Curso.
     * @param idProfesor ID que hace referencia al atributo id de la clase Profesor.
     */
    public void asignarProfesorACurso(String codigoCurso,String idProfesor){
        Profesor idEncontrado = buscarProfesorPorId(idProfesor);
        Curso codigoEncontrado = buscarCursoPorCodigo(codigoCurso);
        
        if( idEncontrado != null && codigoEncontrado != null){
            codigoEncontrado.setProfesor(idEncontrado);
        }   
    }
    /**
     * Metodo que lista los objetos que se encuentran en la lista profesor.
     */
    public void listarProfesor(){
        for (Profesor profesores : profesor) {
            profesores.mostrarInfo();
        }
    }
    /**
     * Metodo que lista los objetos que se encuentran en la lista cursos.
     */
    public void listarCursos(){
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    /**
     * Metodo que busca un profesor dentro de la lista profesor por su id.
     * @param id atributo id de la clase Profesor
     * @return devuelve la referencia del profesor.
     */
    public Profesor buscarProfesorPorId( String id){
        Profesor idEncontrado = null;
        int i = 0;
        while(i < profesor.size() && !this.profesor.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if(i < profesor.size()){
            idEncontrado = this.profesor.get(i);
        }
        return idEncontrado;
    }
    /**
     * Metodo que busca un curso dentro de la lista cursos por su codigo.
     * @param codigo atributo codigo de la clase Curso.
     * @return devuelve la referencia del Curso.
     */
    public Curso buscarCursoPorCodigo(String codigo){
        Curso codigoEncontrado = null;
        int i = 0;
        while(i < cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
            i++;
        }
        if(i < cursos.size()){
            codigoEncontrado = this.cursos.get(i);
        }
        return codigoEncontrado;
    }
    /**
     * Metodo que elimina un curso de la lista cursos, este busca el curso por su atributo codigo con el metodo
     * buscarCursoPorCodigo() y luego verifica que este no sea null, para eliminarlo.
     * @param codigo atributo codigo de la clase Curso.
     */
    public void elimarCurso(String codigo){
        Curso c = buscarCursoPorCodigo(codigo);
        if(cursos.remove(c) && c != null){
            c.setProfesor(null);
        }
    }
    
    public void eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);
        if( p != null){
           for (Curso c : cursos) {
            if (c.getProfesor() != null && c.getProfesor() == p){
                c.setProfesor(null);
            }
            }
        profesor.remove(p);
        }
    }
}
