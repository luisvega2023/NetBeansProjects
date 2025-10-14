
package Actividad_02;

import java.util.ArrayList;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una lista de figuras.
        ArrayList<Figura>figura = new ArrayList<>();
        //Se agregan figuras.
        figura.add( new Circulo(13, "Circulo"));
        figura.add(new Rectangulo(15, 12, "Rectangulo"));
        //Se crea un metodo for each y se describe cada figura.
        for (Figura figura1 : figura) {
            System.out.println( "Perimetro del "+ figura1.getNombre() + " : " + figura1.calcularArea() );
        }
    }
    
}
