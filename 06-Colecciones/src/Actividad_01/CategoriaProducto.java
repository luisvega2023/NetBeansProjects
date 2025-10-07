
package Actividad_01;

/**
 *
 * @author luisd
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;
    
    //CONTRUCTOR
    private CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }
    //GETTER
    public String getDescripcion(){
        return descripcion;
    }
}
