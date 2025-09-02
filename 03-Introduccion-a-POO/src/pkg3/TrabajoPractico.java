/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3;

/**
 *
 * @author luisd
 */
public class TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Resgistro de Estudiante
        System.out.println("\n1. Registro de Estudiante.");
        Estudiantes a = new Estudiantes();//Se crea una instancia a un estudiante "a".
        a.mostrarInfo();//Se muestra su informacion
        a.subirCalificacion(6);//se le sube la calificacion.
        a.bajarCalificacion(2);//se le baja la calificacion.
        System.out.println("////////////////////");
        a.mostrarInfo();//Se muestra su informacion modificada.
        //2. Registro de Mascota
        System.out.println("\n2. Registro de Mascota.");
        Mascotas perro = new Mascotas();//Se crea una instancia perro de la clase Mascotas.
        perro.mostrarInfo();//Se muesta informacion.
        perro.cumplirAnios(1);//Se simula el paso del tiempo.
        System.out.println("///////////////////");
        perro.mostrarInfo();//Se verifican los cambios.
        //3. Encapsulamiento con la Clase Libro
        System.out.println("\n3. Registro de Libro.");
        Libro nuevo = new Libro();//Se crea una instancia nuevo de la clase Libro.
        nuevo.setAnioPublicacion(-1000);//Se modifica con un valor invalido.
        nuevo.setAnioPublicacion(1900);//Se modifica con un valor valido.
        System.out.println("Año de publicacion: " + nuevo.getAnioPublicacion());//Se muestra la informacion.
        //4. Gestion de Gallinas en Granja Digital.
        System.out.println("\n4. Gestion de Gallinas en Granja Digital.");
        Gallina gallina1 = new Gallina();//Se crea una instancia gallina1 de la clase Gallina.
        Gallina gallina2 = new Gallina();//Se crea una instancia gallina2 de la clase Gallina.
        gallina1.envejecer(2);//se simula que Gallina1 envejece 2 años.
        gallina1.ponerHuevo(4);//se simula que Gallina1 pone 4 huevos.
        System.out.println("1ra Gallina.");
        gallina1.mostrarEstado();//Mostrar estado de gallina 1.
        gallina2.envejecer(3);//se simula que Gallina2 envejece 3 años.
        gallina2.ponerHuevo(5);//se simula que Gallina2 pone 5 huevos.
        System.out.println("2da Gallina.");
        gallina2.mostrarEstado();//Mostrar estado de gallina 2.
        //5. Simulacion de Nave Espacial.
        System.out.println("\n5. Simulacion de Nave Espacial.");
        NaveEspacial nave = new NaveEspacial();//Se crea una instancia nave de la clase NaveEspacial.
        nave.avanzar(100);
        nave.recargarCombustible(40);
        nave.avanzar(150);
    }
    
}
