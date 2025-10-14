
package Actividad_04;

/**
 *
 * @author luisd
 */
public class Gato extends Animal{
    
    //CONTRUCTOR
    public Gato(String color, int patas, boolean orejas) {
        super(color, patas, orejas);
    }

    @Override
    public void hacerSonido() {
        System.out.println("MIAU MIAU");
    }

    @Override
    public void describirAnimal() {
        System.out.println("El gato tiene " + this.getPatas() + " patas, es de color " + " y tiene orejas" );
    }
    
}
