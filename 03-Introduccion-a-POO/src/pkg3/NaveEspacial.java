
package pkg3;


public class NaveEspacial {
    private String nombre;
    private int combustible;
   
    
    
    public void despegar(){
        if (combustible > 0){//condicional doble que valida si el combustible es mayor a 0.
            System.out.println("Despegue exitoso!!");
        }else{
            System.out.println("No tiene suficiente combustible.");
        }
    }
    public void avanzar(int distancia){
        if (combustible > 0){//condicional doble que valida si el combustible es mayor a 0.
            System.out.println("Avanzando...");
        }else{
            System.out.println("No tiene suficiente combustible.");
        }
    }
    public void recargarCombustible(int cantidad){//SETTER que simula una carga de combustible.
        if(cantidad>0 && cantidad <= 50){//condicional que valida si el dato ingresado es mayor a 0 y menor o igual a 50.
            combustible += cantidad;
        }
    }
    public void mostrarEstado(){
        System.out.println("nombre: " + nombre + "\ncombustible: " + combustible);//funcion que muesta los valores de los atributos.
    }
}
