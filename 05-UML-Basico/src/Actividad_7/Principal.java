
package Actividad_7;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Luis", "A3");
        Motor motor = new Motor("2.0", 123450);
        Vehiculo vehiculo = new Vehiculo("AA750HH", "IVECO", motor);
        vehiculo.setConductor(conductor);
        
        System.out.println(vehiculo);
    }
    
}
