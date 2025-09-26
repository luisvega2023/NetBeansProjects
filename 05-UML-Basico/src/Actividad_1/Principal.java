/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_1;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Actividad 1.
        Titular titular = new Titular("Luis","15231523");
        Pasaporte pasaporte = new Pasaporte("1234566", "15/09/2025", "HD", "JPG");
        titular.setPasaporte(pasaporte);
        System.out.println(pasaporte);
    }
    
}
