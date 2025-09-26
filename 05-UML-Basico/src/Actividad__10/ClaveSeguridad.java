
package Actividad__10;

/**
 *
 * @author luisd
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }

    

}
