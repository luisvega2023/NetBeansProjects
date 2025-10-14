
package Actividad_04;

/**
 *
 * @author luisd
 */
public abstract class Animal {
    private String color;
    private int patas;
    private boolean orejas;
    
    //CONTRUCTOR
    public Animal(String color, int patas, boolean orejas) {
        this.color = color;
        this.patas = patas;
        this.orejas = orejas;
    }
    //GETTERS 
    public String getColor() {
        return color;
    }

    public int getPatas() {
        return patas;
    }

    public boolean isOrejas() {
        return orejas;
    }
    //METODOS ABSTRACT
    public abstract void hacerSonido();
    public abstract void describirAnimal();
}
