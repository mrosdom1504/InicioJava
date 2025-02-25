package GestionInventario;

import java.util.ArrayList;

public class Inventario {
    private static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    public static void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void venderProducto(int codigo, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                producto.reducirStock(cantidad);
            }
        }
    }
}
