/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.poo;

/**
 *
 * @author Luis Vega
 */
public class Principal {
    public static void main(String[] args) {
        //instancia varios objetos usando ambos constructores.
        Empleado a = new Empleado("Luis","Operador");
        Empleado b = new Empleado(122,"Carlos", "Gruero", 100);
        //Aplica los metodos actualizarSalario() sobre distintos empleados.
        a.actualizarSalario(100);
        b.actualizarSalario(10);
        //imprime la informacion de cada empleado con toString().
        System.out.println(a);
        System.out.println(b);
        //Muestra el total de empleados creados.
        System.out.println("Total de Empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
