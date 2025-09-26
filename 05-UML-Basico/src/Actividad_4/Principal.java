/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
    Cliente cliente = new Cliente("Luis", "40123542");
    Banco banco = new Banco("BBVA", "12345678");
    TarjetaDeCredito tdc = new TarjetaDeCredito("1232-1416-7521", "06/30", banco);
    cliente.setTarjetaDeCredito(tdc);
    System.out.println(tdc);
    }
    
}
