/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4;

/**
 *
 * @author luisd
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tdc;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tdc) {
        this.tdc = tdc;
        if (tdc != null && tdc.getCliente() != this) {
            tdc.setCliente(this);
        }
    }
    
    public TarjetaDeCredito getTdc(){
        return tdc;
    }

}
