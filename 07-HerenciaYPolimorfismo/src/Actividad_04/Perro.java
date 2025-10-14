
package Actividad_04;

/**
 *
 * @author luisd
 */
public class Perro extends Animal {
    
    //CONTRUCTOR
    public Perro(String color, int patas, boolean orejas) {
        super(color, patas, orejas);
    }

    @Override
    public void hacerSonido() {
        System.out.println("GUA GUA");
    }

    @Override
    public void describirAnimal() {
        System.out.println("El perro tiene " + this.getPatas() + " patas, es de color " + " y tiene orejas" );
    }
    
}
