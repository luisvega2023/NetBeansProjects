
package pkg3;


public class Estudiantes {
    private String nombre;
    private String apellido;
    private int curso;
    private int calificacion;
    
    //funcion que muestra los valores de los atributos.
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    //Subir calificacion.
    public void subirCalificacion( int puntos){
        if(puntos>0){//condicional que valida que el dato ingresado sea mayor a 0.
            calificacion += puntos;
        }
        
    }
    //bajar calificacion.
    public void bajarCalificacion (int puntos){
        if(puntos>0){//condicional que valida que el dato ingresado sea mayor a 0.
            calificacion -= puntos;
        }  
    }
}
