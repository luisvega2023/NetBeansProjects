
package Actividad_02;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        Biblioteca biblio = new Biblioteca("La nueva");
        // 2. Creamos 3 autores.
        Autor a1 = new Autor("111", "Luis", "Argentina");
        Autor a2 = new Autor("222", "Alberto", "Uruguay");
        Autor a3 = new Autor("333", "Antoine", "Francia");
        // 3. Agregar 5 libros a la biblioteca.
        biblio.agregarLibro("1122", "El Principito", 1900, a3);
        biblio.agregarLibro("1133", "El Niño que vuela", 2010, a2);
        biblio.agregarLibro("1144", "La Zanahoria que canta", 2000, a1);
        biblio.agregarLibro("1155", "Vuelta y Vuelta", 2020, a2);
        biblio.agregarLibro("1166", "50 sombras del brayan", 1960, a1);
        // 4. Se buscar un libro por su ISBN y se muestra.
        System.out.println("////////////SE LISTAN TODOS LOS LIBROS//////////");
        biblio.listarLibros();
        // 5. Se buscar un libro por su ISBN y se muestra.
        System.out.println("\n////////////LIBRO BUSCADO POR EL ISBN//////////");
        System.out.println("Libro buscado: " + biblio.buscarLibroPorIsbn("1155"));
        // 6. Se filtrar y muestran libros publicados un año especifico.
        System.out.println("\n////////////SE FILTRAN LIBROS POR AÑO//////////");
        System.out.println(biblio.filtrarLibrosPorAnio(2000));
        // 7. Se elimina un libro po su ISBN y se listan.
        System.out.println("\n////////////SE ELIMINA UN LIBRO Y SE LISTAN//////////");
        biblio.eliminarLibro("1166");
        biblio.listarLibros();
        // 8. Se muestra la cantidad total de libros en la biblioteca.
        System.out.println("\n////////////TOTAL DE LIBROS//////////");
        System.out.println("Cantidad total de libros: " + biblio.obtenerCantidadLibros());
        // 9. Lista de todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n////////////LISTA DE AUTORES//////////");
        biblio.mostrarAutoresDispoinibles();
        
    }
    
}
