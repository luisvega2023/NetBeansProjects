
package Actividad__14;

/**
 *
 * @author luisd
 */
public class Principal {


    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Version 1.0", 60);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4", proyecto);
                
    }
    
}
