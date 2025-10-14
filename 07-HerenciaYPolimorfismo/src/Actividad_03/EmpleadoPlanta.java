
package Actividad_03;

/**
 *
 * @author luisd
 */
public class EmpleadoPlanta extends Empleado{
    
    private int horas;
    
    //CONTRUCTOR
    public EmpleadoPlanta(int horas, String nombre) {
        super(nombre);
        this.horas = horas;
    }
    
    @Override
    public int calcularSueldo() {
        return horas * 4800;
    }
    
}
