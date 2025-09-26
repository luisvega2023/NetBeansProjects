/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_8;

/**
 *
 * @author luisd
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Documento documento;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario, String titulo, String contenido) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
        this.documento = new Documento(titulo, contenido);
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", documento=" + documento + ", usuario=" + usuario + '}';
    }
    
    
}
