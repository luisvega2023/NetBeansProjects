
package Actividad__14;

/**
 *
 * @author luisd
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }

    public Render(String formato) {
        this.formato = formato;
    }
    
    
}
