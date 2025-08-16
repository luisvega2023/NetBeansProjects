/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabrajopractico.pkg2;

import java.util.Scanner;

public class TP2_Funciones {
    public static double descuento11 = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaracion de variables.
        int impuesto,descuento,preciobase,peso,stockActual,cantidadVendida,cantidadRecibida,nuevoStock;
        double precioProducto, costoEnvio,totalCompra,precio;
        String zona;
        
        
        //Actividad 8.
        System.out.print("Ingrese el precio base del producto: ");
        preciobase = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje(Ejemplo: 10 para 10%): ");
        impuesto = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje(Ejemplo:5 para 5%): ");
        descuento = Integer.parseInt(input.nextLine());

        calcularPrecioFinal(impuesto,descuento,preciobase);

        //Actividad 9.
        System.out.print("Ingrese el costo del producto: ");
        precioProducto = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete: ");
        peso = Integer.parseInt(input.nextLine());
    
        System.out.print("Ingrese la zona de destino: ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso,zona);
        totalCompra = calcularTotalCompra(precioProducto,costoEnvio);
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
        //Actividad 10.
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantida recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        //Actividad 11.
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
    /**
     * Actividad 8.
     * Desde main(), solicita el precio base del producto, el porcentaje de 
     * impuesto y el porcentaje de descuento, llama al método y muestra el precio 
     * final. 
     * @param Impuesto numero decimal que sera dividido por 100, para sumar un porcentaje a <code>PrecioBase</code>.
     * @param Descuento numero decimal que sera dividido por 100, para restar un porcentaje a <code>PrecioBase</code>.
     * @param PrecioBase numero decimal que hara referencia a un precio al que se le aplicara impuestos y descuentos.
     */
    public static void calcularPrecioFinal(double Impuesto, double Descuento, double PrecioBase){
        double PrecioFinal,impuestos,descuentos;
        
        impuestos = Impuesto/100;
        descuentos = Descuento/100;

        PrecioFinal = PrecioBase + (PrecioBase * impuestos) - (PrecioBase * descuentos);
        System.out.println("El precio final del producto es: " + PrecioFinal);
    }
    /**
     * Actividad 9 a.
     * Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del 
     * paquete.
     * @param peso numero decimal que sera multiplicado por el valor asignado a la <code>zona</code>.
     * @param zona string que sera comparado en una condicional y si el valor es verdadero, el peso sera multiplicado por el valor de la zona.
     */
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")){
            peso *= 5;
        
        }else if(zona.equalsIgnoreCase("Internacional")){
            peso *= 10;
        }
        return peso;
    }
    /**
     * Actividad 9 b.
     * para sumar el costo del producto con el costo de envío. 
     * @param precioProducto numero decimal que se sumara con el <code>costoEnvio</code>.
     * @param costoEnvio numero decimal que se sumara con el <code>precioProducto</code>
     * @return 
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double total = precioProducto + costoEnvio;
        return total;
    }
    /**
     * Actividad 10.
     * metodo que calcula el nuevo stock después de una venta y recepción de productos.
     * @param stockActual numero entero del que se se le restara <code>cantidadVendida</code> y se le suma <code>cantidadRecibida</code>.
     * @param cantidadVendida numero entero que se resta a <code>stockActual</code>.
     * @param cantidadRecibida numero entero que se suma a <code>stockActual</code>.
     * @return 
     */
    public static int actualizarStock(int stockActual,int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    /**
     * Actividad 11.
     * Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
     * método calcularDescuentoEspecial(double precio) que use la variable global para 
     * calcular el descuento especial del 10%.
     * @param precio nuemero entero del que se le restara el valor de la variable global descuento.
     */
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio - (precio * TP2_Funciones.descuento11);
        System.out.println("El descuento especial aplicado es: " + (precio * TP2_Funciones.descuento11));
        System.out.println("El precio final con descuento es: " + descuentoAplicado);
    }
}
