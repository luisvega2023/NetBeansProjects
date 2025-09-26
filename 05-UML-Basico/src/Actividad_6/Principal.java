
package Actividad_6;

/**
 *
 * @author luisd
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente =new Cliente("Luis", "154123456");
        Mesa mesa = new Mesa(10, 4);
        Reserva reserva = new Reserva("24/09/2025", "15:30", mesa);
        reserva.setCliente(cliente);
        System.out.println(reserva);
    }
    
}
