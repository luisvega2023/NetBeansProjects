
package Actividad_5;

/**
 *
 * @author luisd
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placamadre;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new PlacaMadre( modelo, chipset);
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + ", placamadre=" + placamadre + '}';
    }
    
    public void SetPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario(){
        return  propietario;
    }
    
}
