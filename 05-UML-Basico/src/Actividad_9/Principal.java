
package Actividad_9;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Paciente a = new Paciente("Luis", "GSN Salud");
        Profesional b = new Profesional("Rodrigo", "Traumatologo");
        CitaMedica c = new CitaMedica("25/09/2025", "15:40");
        c.setPaciente(a);
        c.setProfesional(b);
        
        System.out.println(c);
    }
    
}
