
package Actividad_01;

/**
 *
 * @author luisd
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    //CONTRUCTOR
    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.getModelo() + "\nMarca: " + this.getMarca() + "\nCantidad de Puertas: " + cantidadPuertas );
    }
}
