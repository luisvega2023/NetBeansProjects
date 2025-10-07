
package AsociacionUnidireccional1aN;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Profesor marcos = new Profesor("Luis");
       
       Curso programacion1 = new Curso("Programacion 1", 10);
       Curso ayso = new Curso("Arquitectura y Sistema Operativo", 20);
       Curso BD = new Curso("Base de Datos 1", 30);
       
       marcos.agregarCurso(ayso);
       marcos.agregarCurso(programacion1);
       marcos.agregarCurso(BD);
       
       
    }
    
}
