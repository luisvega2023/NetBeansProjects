
package Actividad_01;

/**
 *
 * @author luisd
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    //CONTRUCTOR
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
    /**
     * metodo que muestra la info de un producto.
     */
    public void mostrarinfo(){
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad + "\nCategoria: " + this.categoria.getDescripcion());
    }
    //GETTER Y SETTER
    public String getId() {
        return id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    



    



}
