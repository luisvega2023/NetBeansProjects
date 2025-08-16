/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabrajopractico.pkg2;

import java.util.Scanner;

public class TP2_EstructurasCondicionales {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaracion de variable.
        int anio,num1,num2,num3,edad,precio;
        double resultado;
        char categoria;
    /*
     * Actividad 1.
     * Escribe un programa en Java que solicite al usuario un año y determine si es 
     * bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
     * divisible por 400.
     */
        //solicitud al usuario y inicializacion de variable.
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        //condicional, donde se verifican datos.
        if ( anio % 4 == 0 & anio % 100 != 0){
            System.out.println("El año " + anio + " es bisiesto.");
        }else if(anio % 400 == 0){
                System.out.println("El año " + anio + " es bisiesto.");
                }else{
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    /*
     * Actividad 2.
     * Escribe un programa en Java que pida al usuario tres números enteros y 
     * determine cuál es el mayor.   
     */  
        //solicitud al usuario y inicializacion de variables.
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        //condicional, donde se verifican datos.
        if (num1 > num2 & num1 > num3){
            System.out.println("el primer numero: " + num1 + " es mayor.");
        } else if(num2 > num3 & num2 > num3){
            System.out.println("El segundo numero: " + num2 + " es mayor.");
        }else{
            System.out.println("El tercer numero: " + num3 + " es mayor.");    
            }
    /*
     * Actividad 3.
     * Escribe un programa en Java que solicite al susuario su edad y clasifique su
     * etapa de vida.
     */

        //solicitud al usuario y inicializacion de variable.
        System.out.print("Ingrese la edad: ");
        edad = Integer.parseInt(input.nextLine());
        //condicional, donde se verifican datos.
        if( edad < 150 || edad <= 0 ){
            if( edad < 12){
                System.out.println("Es un Niño.");
            }else if( edad >= 12 & edad <= 17){
                System.out.println("Es un Adolescente.");
            }else if( edad >= 18 & edad <= 59){
                System.out.println("Es un Adulto.");
            }else{
                System.out.println("Es un Adulto Mayor.");
            }
        }else{
            System.out.println("La edad ingresada no es valida.");
        }
    /*
     * Actividad 4.
     * Escribe un programa que solicite al usuario el precio de un producto y 
     * su categoría (A, B o C).
     */

        //solicitud al usuario y iniziliacion de variable.
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Categoria A: 10% de descuento.\nCategoria B: 15% de descuento.\nCategoria C: 20% de descuento.");
        System.out.print("Ingrese la categoria: ");
        categoria = input.next().charAt(0);
        //condicional, donde se verifican los datos ingresados.
        if ( categoria == 'A' || categoria == 'a' ){
            resultado = precio * (1 - 0.15);
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Precio Final : " + resultado);
        }else if( categoria == 'B' || categoria == 'b'){
            resultado = precio * (1 - 0.20);
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Precio Final : " + resultado);
        }else if( categoria == 'B' || categoria == 'b'){
            resultado = precio * (1 - 0.20);
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Precio Final : " + resultado);
        }else{
            System.out.println("La categoria ingresa es incorrecta.");
        }
    }
}
