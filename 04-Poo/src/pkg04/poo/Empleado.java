
package pkg04.poo;

/**
 *
 * @author Luis Vega
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    //01. USO DE THIS.
    //02. CONTRUCTORES SOBRECARGADOS.
    public Empleado( int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }
    public Empleado (String nombre, String puesto){
        this.id = idAuto();
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000000.50;
        totalEmpleados ++;
    }
    /**
     * Metodo que simula generar automaticamente un valor id.
     * @return devuelve un valor.
     */
    private static int idAuto(){
        int idAutomatica = 100;
        return idAutomatica ;
    }
    //03. METODOS SOBRECARGADOS actualizarSalario().
    /**
     * Metodo que recibe un porcentaje de aumento en el salario.
     * @param x numero entrero que se va a dividir por 100, se multiplicara por el salario y se sumara al salario.
     */
    public void actualizarSalario(int x){ 
        salario = salario + salario * x / 100;
    }
    /**
     * Metodo que recibe una cantidad fija a aumentar al salario.
     * @param x numero decimal que se suma al salario actual.
     */
    public void actualizarSalario(double x){//Metodo en el que recibe una cantidad fija a aumentar.
        salario += x;
    }
    //04. METODO toString()
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    //05. METODO ESTATICO mostrarTotalEmpleados().
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    //06. GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        
    
}

