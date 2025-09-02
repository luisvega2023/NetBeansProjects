
package pkg3;


public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo(int x){
        if(x>0){//Condicional que valide los datos ingresados sean mayores que 0.
            huevosPuestos += x;            
        }
    }
    
    public void envejecer(int x){
        if(x>0){//Condicional que valide los datos ingresados sean mayores que 0.
            edad += x;
        }
    }
    public void mostrarEstado(){//funcion que imprime por pantalla los valores de los atributos.
        System.out.println("idGalllina: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos );
    }
}
