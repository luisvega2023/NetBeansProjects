
package Actividad_01;

import java.util.ArrayList;

/**
 *
 * @author luisd
 */
public class Inventario {
    ArrayList<Producto> productos;

    //CONTRUCTOR
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    /**
     * Metodo que recibe un objeto y lo almacena en la ArrayList productos.
     * @param p objeto de la clase producto, que se agrega a la lista.
     */
    public void agregarProducto( Producto p){
        this.productos.add(p);
    }
    /**
     * Metodo que imprime por consola los productos almacenados en la ArrayList
     */
    public void listarProductos(){
        for (Producto a : productos) {
            System.out.println(a);
        }
    }
    /**
     * Metodo que busca un producto en la lista utilizando su id, el mismo recorre la lista
     * de productos hasta encontrar uno cuyo id coincida (Ignorando mayusculas/minusculas)
     * y el producto ubicado en el intervalo no sea igual al id ingresado.
     * @param id ID del producto a buscar.
     * @return El producto con el id especificado, o null si no se encuentra.
     */
    public Producto buscarProductoPorId(String id){
        Producto idEncontrado = null;
        int i = 0;
        while(i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if(i < productos.size()){
            idEncontrado = this.productos.get(i);
        }
        return idEncontrado;
    }
    /**
     * Metodo que recibe un id de un producto, busca el mismo en la lista con el metodo buscarProductoPorId() y lo elimina de la lista.
     * @param id ID del producto a eliminar.
     */
    public void eliminarProducto(String id){
        this.productos.remove(buscarProductoPorId(id));
    }
    /**
     * Metodo que busca un producto en la lista utilizando su id, con el metodo buscarProductoPorId()
     * y luego actualiza la cantidad de stock del producto.
     * @param id ID del producto a buscar.
     * @param nuevaCantidad Cantidad del producto a actualizar.
     */
    public void actualizarStock( String id, int nuevaCantidad){
        buscarProductoPorId(id).setCantidad(nuevaCantidad);
    }
    /**
     * Metodo que filtra los producto por categoria, devolviendo los productos con la categoria ingresada.
     * @param categoria Categoria del producto a filtrar.
     * @return los productos de la categoria especificada.
     */
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
       ArrayList<Producto> filtrarPorCat = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria){
                filtrarPorCat.add(producto);
            }
        }
        return filtrarPorCat;
    }
    /**
     * Metodo que obtiene el total de Stock en el inventario, este recorre todos los producto, suma la cantidad de cada uno y los imprime por consola.
     */
    public void obtenerTotalStock(){
        int acu = 0;
        for (Producto producto : productos) {
            acu += producto.getCantidad();
        }
        System.out.println("Total de Stock disponible: " + acu);
    }
    /**
     * Metodo que obtiene el producto con mayor stock, este recorre todos los producto con un for, lo verifica con una condicional
     * y imprime por consola.
     */
    public void obtenerProductoConMayorStock(){
        int MStock = 0;
        String MSProducto = "";
        for (Producto producto : productos) {
            if(producto.getCantidad()> MStock){
                MStock = producto.getCantidad();
                MSProducto = producto.getNombre();
            }
        
        }
        System.out.println("El producto con mayor stock es: " + MSProducto + " Stock: " + MStock);
    }
    /**
     * Metodo que filta productos entre un precio minimo y uno maximo.
     * @param min Precio minimo a filtrar.
     * @param max Precio maximo a filtrar.
     * @return Devuelve una lista con los productos que se encuentran entre el minimo y maximo de precio.
     */
    public ArrayList<Producto> filtrarProductosPorPrecios( double min, double max){
        ArrayList<Producto>FiltrarPorPrecio = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getPrecio() > min && producto.getPrecio() < max){
                FiltrarPorPrecio.add(producto);
            }
        }
        return FiltrarPorPrecio; 
    }
    /**
     * Metodo que muestra todas las categorias disponibles con su descripcion.
     */
    public void mostrarCategoriasDisponible(){
        for (Producto producto : productos) {
            System.out.println("Categoria: " + producto.getCategoria() + " Descriocion: " + producto.getCategoria().getDescripcion());
        }
    }
}
