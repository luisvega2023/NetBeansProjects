
package Actividad_9;

/**
 *
 * @author luisd
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional){
        this.profesional = profesional;
    }
}
