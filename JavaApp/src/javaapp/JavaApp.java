
package javaapp;

import java.util.Scanner;


public class JavaApp {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        Double altura;
        System.out.println("Ingrese el nombre de usuario");
        nombre = input.nextLine();
        
        System.out.println(nombre);
        // pedir al usuario que ingrese datos.
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa tu altura: ");
        altura = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu altura es: " + altura);
        System.out.println("Tu nombre es: " + nombre);
    }   
   
}
