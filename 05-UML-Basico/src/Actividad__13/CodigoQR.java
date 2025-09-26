
package Actividad__13;

/**
 *
 * @author luisd
 */
public class CodigoQR {
    private int valor;
    private Usuario usuario;

    public CodigoQR(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }

    public int getValor() {
        return valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
