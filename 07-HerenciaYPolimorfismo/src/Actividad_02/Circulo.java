
package Actividad_02;

/**
 *
 * @author luisd
 */
public class Circulo extends Figura{
    private double radio;
    //CONTRUCTOR
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return 2 * radio * Math.PI;
    }
}
