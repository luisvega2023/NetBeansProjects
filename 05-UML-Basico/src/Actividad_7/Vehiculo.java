
package Actividad_7;

/**
 *
 * @author luisd
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + conductor + '}';
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(this.conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    public Conductor getConductor(){
        return conductor;
    }
            
}
