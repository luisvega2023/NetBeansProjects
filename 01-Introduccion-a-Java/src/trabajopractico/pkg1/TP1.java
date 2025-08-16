/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico.pkg1;

import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.
        //DECLARACION DE VARIABLES
        String nombre = "Luis";
        int edad = 28;
        double altura = 1.80;
        boolean estudiante = true;
        //IMPRESION DE VAROLES POR CONSOLA
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
        //EJERCICIO 4.
        Scanner input = new Scanner(System.in);
        //SOLICITUD AL USUARIO DE DATOS
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        //IMPRESION POR PANTALLA
        System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años");
        //EJERCICIO 5.
        //DECLARACION DE VARIABLES
        int num1, num2,suma , resta, mult, div;
        //SOLICITUD AL USUARIO Y VALIDACION DE VARIABLES
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        //OPERACIONES
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        //IMPRESION POR PANTALLA
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
        //EJERCICIO 6.
        System.out.println("Nombre: Juan Pérez\nEdad:30 años\nDirección: \"Calle Falsa 123\"");
        //EJERCICIO 8.
        double divisao;
        divisao  = (double)num1 / num2;
        System.out.println("La division de "+num1+" y "+num2+" es: "+divisao);
        //EJERCICIO 9.
        String nombre2;
        System.out.println("Ingresa tu nombre: ");
        nombre2 = input.nextLine();
        System.out.println("Hola, " + nombre2);
    }
    
}
