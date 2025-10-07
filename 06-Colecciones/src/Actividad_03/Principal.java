
package Actividad_03;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Se crean al menos 3 profesores y 5 cursos.
        Profesor a = new Profesor("1144", "Luis", "Programacion");
        Profesor b = new Profesor("1133", "Fernando", "Base de Datos");
        Profesor c = new Profesor("1122", "Alejandra", "Ingles");
        Curso a1 = new Curso("ASD123", "A1");
        Curso a2 = new Curso("ASD134", "A2");
        Curso a3 = new Curso("AWE245", "B1");
        Curso a4 = new Curso("AQW136", "B2");
        Curso a5 = new Curso("HDE743", "C1");
        // 2. Se agregan profesores y cursos a la universidad.
        Universidad u = new Universidad("UTN - San Nicolas");
        u.agregarProfesor(a);
        u.agregarProfesor(b);
        u.agregarProfesor(c);
        u.agregarCurso(a1);
        u.agregarCurso(a2);
        u.agregarCurso(a3);
        u.agregarCurso(a4);
        u.agregarCurso(a5);
        // 3. Se asignan profesores a cursos usando asignarProfesorACurso().
        u.asignarProfesorACurso("ASD134", "1133");
        u.asignarProfesorACurso("ASD123", "1133");
        u.asignarProfesorACurso("HDE743", "1122");
        u.asignarProfesorACurso("AWE245", "1144");
        u.asignarProfesorACurso("AQW136", "1144");
        // 4. Se listan Cursos y profesores.
        System.out.println("//////////CURSOS////////");
        u.listarCursos();
        System.out.println("\n//////////PROFESOR////////");
        u.listarProfesor();
        // 5. Se cambia un profesor de curso y se verifican los cambios.
        System.out.println("\n/////////CAMBIO DE CURSO////////");
        u.asignarProfesorACurso("AWE245", "1122");
        a3.mostrarInfo();
        System.out.println("");
        c.mostrarInfo();
        // 6. Se remueve un curso y se verifica con el profesor.
        System.out.println("\n/////////REMUEVO UN CURSO////////");
        u.elimarCurso("ASD123");
        System.out.println(u.buscarProfesorPorId("1133"));
        // 7. Se remueve un profesor y se verifica que ya no aparesca.
        System.out.println("\n/////////SE REMUEVE UN PROFESOR////////");
        u.eliminarProfesor("1144");
        System.out.println(u.buscarProfesorPorId("1144"));
        // 8. Se muestra un reporte de la cantidad de cursos por profesor.
        System.out.println("\n/////////SE MUESTRA UN REPORTE////////");
        u.listarProfesor();
    }
    
}
