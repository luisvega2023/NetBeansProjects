/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabrajopractico.pkg2;

import java.util.Scanner;

public class TP2_EstructurasDeRepeticion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaracion de variables.
        int num,suma,contp,contn,contc,nota;
        /*
         * Actividad 5.
         * Escribe un programa que solicite números al usuario y sume solo los 
         * números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
         * 0, momento en el que se debe mostrar la suma total de los pares ingresados.
         */
        //inicializacion de variable acumuladora.
        suma = 0;
        //bucle while que reitera hasta que el usuario ingresa 0.
        System.out.print("Ingrese un numero (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        while(num != 0){
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0){
                suma += num;
            }
        }
        System.out.println("La suma total de los numeros pares es: " + suma);
        
        /*
         * Actividad 6.
         * Escribe un programa que pida al usuario ingresar 10 números enteros y 
         * cuente cuántos son positivos, negativos y cuántos son ceros. 
         */
        //la declaracion de variables en la linea 20.
        //inicializacion de variables contadoras.
        contp = 0;
        contn = 0;
        contc = 0;
        //bucle for que reitera 10 veces.     
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un numero: ");
            num = Integer.parseInt(input.nextLine());
            if(num > 0){
                contp += 1;
            }else if(num < 0){
                contn += 1;
            }else{
                contc += 1;
            }
        }
        //impresion por pantalla
        System.out.println("Resultados: \nPositivos: " + contp + "\nNegativos: " + contn + "\nCeros: " + contc);
        
        /*
         * Actividad 7.
         * Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el 
         * usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
         * hasta que ingrese un valor válido.
         */
        //bucle do-while que reitera hasta que el usuario ingrese bien el dato.
        do{
            //solicitud al usuario.
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            //condicional que verifica si el numero ingresado es valido.
            if(nota < 0 || nota > 10){
                System.out.println("La nota ingresada no es valida.");
            }
        }while(nota < 0 || nota > 10);
    
    }
    
}
