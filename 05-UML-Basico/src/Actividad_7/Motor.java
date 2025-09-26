
package Actividad_7;

/**
 *
 * @author luisd
 */
public class Motor {
    private String tipo;
    private int numeroSerie;

    public Motor(String tipo, int numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
    
    
}
