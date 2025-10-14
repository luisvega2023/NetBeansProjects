
package Actividad_04;

import java.util.ArrayList;

/**
 *
 * @author luisd
 */
public class Principal {


    public static void main(String[] args) {
        //Se crea lista de animales.
        ArrayList<Animal> a = new ArrayList<>();
        //Se agregan animales.
        a.add( new Perro("Negro", 4, true));
        a.add( new Vaca("blanco y negro", 4, true));
        a.add( new Gato("Naranja", 4, true));
        //Se crea un bucle for each y se llama el metodo sobrescrito hacerSonido().
        for (Animal animal : a) {
            animal.hacerSonido();
        }
    }
    
}
