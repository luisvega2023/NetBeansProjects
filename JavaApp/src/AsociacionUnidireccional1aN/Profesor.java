
package AsociacionUnidireccional1aN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Profesor {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>();
    
    public Profesor(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    public void eliminarCurso(Curso curso){
        cursos.add(curso);
    }
    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }
}
