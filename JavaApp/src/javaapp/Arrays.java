package javaapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisd
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] edades = new int[6];//se declara un vector y se le define la cantidad de elementos que guarda.
        int[] edadess;
        edadess = new int[7]; //se puede declarar en una linea una variable y luego agregar el valor.
        //tambien se puede declarar un vector de la siguiente forma.
        int[] edad = {20,40,50,60,20};
        edad[3] = 80; // cambiar valor
        
        //como cambiar y imprimir un valor.
        System.out.println(edad[2]);
        edad[2] = 25;
        System.out.println(edad[2]);
        
        //mostrar todos los elementos.
        for (int i = 0; i < edad.length; i++) {
            System.out.print(edad[i] + " ");
        }
        System.out.println("");
    }
    
}
