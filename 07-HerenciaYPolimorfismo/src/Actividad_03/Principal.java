
package Actividad_03;

import java.util.ArrayList;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        //SE CREA LISTA DE EMPLEADOS.
        ArrayList<Empleado> empleado = new ArrayList<>();
        //SE AGREGAN EMPLEADOS A LA LISTA.
        empleado.add( new EmpleadoPlanta(200, "Luis" ));
        empleado.add( new EmpleadoTemporal(300, "Jose"));
        //Se crea un bucle for each, se invoca el metodo calcularSueldo()
        //y se usa instanceof para calificar.
        for (Empleado a : empleado) {
            if(a instanceof EmpleadoPlanta){
                System.out.println("El Empleado de Planta " + a.getNombre() + " Cobra: $" + a.calcularSueldo());
            }else{
                System.out.println("El Empleado Temporal " + a.getNombre() + " Cobra: $" + a.calcularSueldo());
            }
        }
    }
    
}
