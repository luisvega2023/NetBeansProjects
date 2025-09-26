/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad__12;

/**
 *
 * @author luisd
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }

    public double getMonto() {
        return monto;
    }
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    
    
    
    
}
