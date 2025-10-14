
package Actividad_02;

/**
 *
 * @author luisd
 */
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;
    
    //CONTRUCTOR
    public Rectangulo(int alto, int ancho, String nombre) {
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea(){
        return 2 * alto + 2 * ancho;
    }
}
