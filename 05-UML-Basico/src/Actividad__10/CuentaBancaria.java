
package Actividad__10;

/**
 *
 * @author luisd
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveseguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveseguridad = new ClaveSeguridad(codigo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveseguridad=" + claveseguridad + ", titular=" + titular + '}';
    }
    
    public void setTitular( Titular titular){
        this.titular = titular;
        if( titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }
    public Titular getTitular(){
        return titular;
    }
}
