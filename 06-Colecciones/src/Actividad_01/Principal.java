
package Actividad_01;

/**
 *
 * @author luisd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario(); 
        // 1. Se crean al menos cinco productos con diferentes categorias y se agregan al inventario.
        inv.agregarProducto(new Producto("1145", "Teclado", 30000, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("1144", "Yerba", 2000.0, 30, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("1143", "Zapatillas", 150000.0, 15, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("1142", "Platos", 1500, 20, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("1141", "Remera", 15000, 5, CategoriaProducto.ROPA));
        // 2. Se listan todos los productos mostrando su informacion y categoria.
        System.out.println("/////////// PRODUCTOS ///////////");
        inv.listarProductos();
        // 3. Se busca un producto por ID y se muestra.
        System.out.println("\n/////////// BUSCAR POR ID ///////////");
        System.out.println(inv.buscarProductoPorId("1143"));
        // 4. Se filtran por categoria y se muestra.
        System.out.println("\n/////////// FILTRAR POR CATEGORIA ///////////");
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));
        // 5. Se elimina un producto por su ID y se listan los productos restantes.
        System.out.println("\n/////////// SE ELIMINA UN PRODUCTO ///////////");
        inv.eliminarProducto("1143");
        inv.listarProductos();
        // 6. Se actualiza el stock de un producto existente.
        System.out.println("\n/////////// SE ACTUALIZA STOCK ///////////");
        inv.actualizarStock("1144", 70);
        // 7. Se muesta el total de stock disponible.
        System.out.println("\n/////////// SE MUESTRA TOTAL DE STOCK ///////////");
        inv.obtenerTotalStock();
        // 8. Se obtiene y muestra el producto con mayor stock.
        System.out.println("\n/////////// PRODUCTO CON MAYOR STOCK ///////////");
        inv.obtenerProductoConMayorStock();
        // 9. Se filtran productos con precios entre $1000 y $3000
        System.out.println("\n/////////// SE FILTRAN POR PRECIO ///////////");
        System.out.println(inv.filtrarProductosPorPrecios(1000, 3000));
        // 10. Se muestra las categorias disponibles con su descripcion.
        System.out.println("\n/////////// CATEGORIAS DISPONIBLES ///////////");
        inv.mostrarCategoriasDisponible();
    }
    
}
