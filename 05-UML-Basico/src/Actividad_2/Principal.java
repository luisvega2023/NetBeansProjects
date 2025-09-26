/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_2;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Luis", "40123546");
        Bateria bateria = new Bateria("Motorola", 100);
        Celular celular = new Celular("111123", "motorola", "C115", bateria);
        usuario.setCelular(celular);
        System.out.println(celular);
    }
    
}
