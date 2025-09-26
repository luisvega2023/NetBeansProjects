/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_1;

/**
 *
 * @author luisd
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(String numero, String fechaEmision, String imagen,String formato){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto( imagen,formato);
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", titular=" + titular + ", foto=" + foto + '}';
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
    public String getNumero(){
        return numero;
    }
    public Titular getTitular(){
        return titular;
    }
}
