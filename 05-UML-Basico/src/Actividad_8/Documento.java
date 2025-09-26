/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_8;

/**
 *
 * @author luisd
 */
public class Documento {
    private String titulo;
    private String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + '}';
    }
    
    
}
