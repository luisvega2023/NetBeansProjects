
package Actividad_03;

/**
 *
 * @author luisd
 */
public class EmpleadoTemporal extends Empleado {
    private int horasEnNegro;
    
    //CONTRUCTOR
    public EmpleadoTemporal(int horasEnNegro, String nombre) {
        super(nombre);
        this.horasEnNegro = horasEnNegro;
    }

    @Override
    public int calcularSueldo() {
        return horasEnNegro * 2000;
    }
    
}
