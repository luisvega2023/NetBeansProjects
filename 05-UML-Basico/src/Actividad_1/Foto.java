/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_1;

/**
 *
 * @author luisd
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String imagen,String formato){
        this.formato = formato;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
    
}
