
package Actividad__13;

/**
 *
 * @author luisd
 */
public class GeneradorQR {
    public void generar(int valor, Usuario usuario){
        CodigoQR a = new CodigoQR( valor);
        a.setUsuario(usuario);
        System.out.println(a.toString());
    }
}
