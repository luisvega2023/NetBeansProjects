/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class Semana2Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont, num;
        cont = 0;
        while(cont <= 5){
            System.out.print(cont+" ");
            cont = cont + 1;
        }
            System.out.println("");
        System.out.print("Ingrese un numero positivo: ");
        num = Integer.parseInt(input.nextLine());
        if (num > 0) {
            if (num % 2 != 0) {//si es impar
                num--; //num = num - 1;
            }
            for (int i = num; i >= 0; i-=2) {
                System.out.print(i + " ");
            }
            System.out.println();//solo salto de linea
        }else{
            System.out.print("El numero debe ser positivo");
        }
        
        int ancho, alto;
        System.out.print("Ingresa el ancho: ");
        ancho = Integer.parseInt(input.nextLine());
        
        while (ancho <= 0){
            System.out.print("ERROR. Ingresa el ancho:");
            ancho = Integer.parseInt(input.nextLine());
        }
        
        System.out.print("Ingrese el alto: ");
        alto = Integer.parseInt(input.nextLine());
        
        while (ancho <= 0){
            System.out.print("ERROR. Ingresa el alto:");
            alto = Integer.parseInt(input.nextLine());
        }
        
        for (int i = 1; i <= alto; i++) {
            for (int c = 1; c <= ancho; c++) {
                System.out.print("X");
            }
            System.out.println();
        }
        
    }
    
}
