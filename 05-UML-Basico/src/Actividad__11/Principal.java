/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad__11;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista = new Artista("Luis", "Rock");
        Cancion cancion = new Cancion("La nueva noche");
        Reproductor reproductor = new Reproductor();
        cancion.setArtista(artista);
        reproductor.reproducir(cancion);
        System.out.println(cancion);
    }
    
}
