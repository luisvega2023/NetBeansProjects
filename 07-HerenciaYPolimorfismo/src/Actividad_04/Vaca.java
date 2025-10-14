
package Actividad_04;

/**
 *
 * @author luisd
 */
public class Vaca extends Animal{
    
    //CONTRUCTOR
    public Vaca(String color, int patas, boolean orejas) {
        super(color, patas, orejas);
    }

    @Override
    public void hacerSonido() {
        System.out.println("MUUU MUUU");
    }

    @Override
    public void describirAnimal() {
        System.out.println("La Vaca tiene " + this.getPatas() + " patas, es de color " + " y tiene orejas" );
    }
    
}
