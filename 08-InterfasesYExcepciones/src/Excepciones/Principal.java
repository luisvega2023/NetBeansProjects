
package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //DIVISION SEGURA
        try {
            System.out.print("Ingrese el dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese el divisor: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        
        //CONVERSION DE CADENA A NUMERO
        try {
            System.out.print("Ingrese un número: ");
            String entrada = sc.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }
        
        
        //LECTURA DE ARCHIVO
        try {
            File archivo = new File("archivo.txt");
            Scanner sx = new Scanner(archivo);
            while (sx.hasNextLine()) {
                System.out.println(sx.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }
        
        
        
        //EXCEPCION PERSONALIZADA
        int edad = -5;
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }

    
}
