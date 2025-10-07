/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02;

/**
 *
 * @author luisd
 */
public class Libros {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libros(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
    
    /**
     * Metodo que muestra la informacion de los libros.
     */
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " ISBN: " + isbn + " Año: " + anioPublicacion + " Autor: " + autor);
    }
    //GETTERS
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
}
