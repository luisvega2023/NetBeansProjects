 
package Actividad_01;

/**
 *
 * @author luisd
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    //CONTRUCTOR
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Metodo que muesta la informacion de una instancia vehiculo.
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
    //GETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
