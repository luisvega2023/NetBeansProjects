/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabrajopractico.pkg2;

public class TP2_ArraysYRecursividad {

    public static void main(String[] args) {
        //Actividad 12.
        System.out.println("Funcion no Recursiva");
        double[] precios = {199.99,299.5,149.75,399.0,89.99};
        System.out.println("Precios originales:");
        mostrarValores(precios);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarValores(precios);
        
        //Actividad 13.
        System.out.println("Funcion Recursiva");
        double[] preciosR = {199.99,299.5,149.75,399.0,89.99};
        System.out.println("Precios originales:");
        mostrarValoresR(preciosR,0);
        preciosR[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarValoresR(preciosR,0);
    }
    public static void mostrarValores(double[] precio){
        for (int i = 0; i < precio.length; i++) {
            System.out.println("Precio: " + precio[i]);
        }
    }
    public static void mostrarValoresR(double [] precio, int x){
        int longitud = precio.length;
        if (x >= longitud){
        } else {
            System.out.println("Precio: " + precio[x]);
            mostrarValoresR(precio, x + 1);
        }
    }
}
