package javaapp;

/**
 *
 * @author luisd
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos (){//Muestra los datos de los atributos.
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    //GETTERS
    public double getSaldo(){//Devuelve el valor de saldo
        return saldo;
    }
    public String getAlias(){
        return alias;
    }
    //SETTERS
    public void setAlias(String nuevoAlias){
        if (nuevoAlias != null){
            alias = nuevoAlias;
        }
    } 
    public void depositar(double x){
        if(x >= 0){
            saldo += x;
        }        
    }
    private boolean saldoDisponible(double monto){
        return saldo >= monto;
    }
    
    public void extraer (double monto){
        if(saldoDisponible(monto)){
            saldo -= monto;
        }
    }
    public static String getHorarioApertura(){
        return "bobobo";
    }
}
