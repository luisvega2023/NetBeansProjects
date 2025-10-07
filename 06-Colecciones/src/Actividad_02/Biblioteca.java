
package Actividad_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Biblioteca {
    private String nombre;
    List<Libros> libro;
    
    //CONTRUCTOR
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libro = new ArrayList<>();
    }
    /**
     * Metodo que crea una instancia de la clase Libros y la almacena en un ArrayList
     * @param isbn Atributo String isbn de la clase libro.
     * @param titulo Atributo String titulo de la clase libro.
     * @param anioPublicado Atributo String aniPublicado de la clase libro.
     * @param autor Atributo String autor de la clase libro.
     */
    public void agregarLibro(String isbn, String titulo, int anioPublicado, Autor autor){
        libro.add(new Libros(isbn, titulo, anioPublicado, autor));
    }
    /**
     * Metodo que imprime por consola el listado de los libros.
     */
    public void listarLibros(){
        for (Libros libros : libro) {
            System.out.println(libros);
        }
    }
    /**
     * Metodo que busca un libro en la lista utilizando su isbn, el mismo recorre la lista
     * de libros hasta encontrar uno cuyo isbn coincida (Ignorando mayusculas/minusculas)
     * y el libro ubicado en el intervalo no sea igual al isbn ingresado.
     * @param isbn ISBN del libro a buscar.
     * @return El Libro con el isbn especificado, o null si no se encuentra.
     */
    public Libros buscarLibroPorIsbn(String isbn){
        Libros isbnEncontrado = null;
        int i = 0;
        while(i < libro.size() && !this.libro.get(i).getIsbn().equalsIgnoreCase(isbn)){
            i++;
        }
        if(i < libro.size()){
            isbnEncontrado = this.libro.get(i);
        }
        return isbnEncontrado;
    }
    /**
     * Metodo que busca un libro por su isbn con el metodo buscarLibroPorIsbn() y lo elimina de la lista.
     * @param isbn ISBN del Libro a buscar.
     */
    public void eliminarLibro(String isbn){
        this.libro.remove(buscarLibroPorIsbn(isbn));
    }
    /**
     * Metodo que cuenta la cantidad de libros que se encuentran en la lista.
     * @return devuelve la cantidad de libros.
     */
    public int obtenerCantidadLibros(){
        int cont = 0;
        for (Libros libros : libro) {
            cont += 1;
        }
        return cont;
    }
    /**
     * Metodo que filtra los libros por anio y los guarda en un ArrayList.
     * @param anio numero entero que hace referencia al año del libro.
     * @return devuelve una lista de libros con el año ingresado.
     */
    public ArrayList<Libros> filtrarLibrosPorAnio(int anio){
       ArrayList<Libros> filtrarPorAnio = new ArrayList<>();
        for (Libros libros : libro) {
            if(libros.getAnioPublicacion() == anio){
                filtrarPorAnio.add(libros);
            }
        }
        return filtrarPorAnio;
    }
    /**
     * Metodo que muestra los autores dispobles en la biblioteca.
     */
    public void mostrarAutoresDispoinibles(){
       HashSet autores = new HashSet();
       for (Libros libros : libro) {
           autores.add(libros.getAutor());
       }
       System.out.println("Autores disponibles: " + autores);
   }
}
