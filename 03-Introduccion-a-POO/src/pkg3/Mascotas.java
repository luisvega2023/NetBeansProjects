
package pkg3;


public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo(){//funcion que muesta los valores de los atributos.
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    public int cumplirAnios(int nuevo){//SETTER que simula el cumplir años.
        return edad += nuevo;
    }
}
