/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;


/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
         
        cb.mostrarDatos();
        cb.setAlias("CAJA.ROPA.PATO");
        cb.mostrarDatos();
        
        System.out.println(cb.getSaldo());
        cb.depositar(200);
        System.out.println(cb.getSaldo());
        cb.extraer(100);
        System.out.println(cb.getSaldo());
    }
    
}