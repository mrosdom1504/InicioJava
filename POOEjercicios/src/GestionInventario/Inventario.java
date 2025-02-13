package GestionInventario;

import java.util.ArrayList;

public class Inventario {
    private static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static Producto buscarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                return productos.get(i);
            }
        }
        return null;
    }

    public static void mostrarInventario() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }

    public static void venderProducto(int codigo, int cantidad) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                productos.get(i).reducirStock(cantidad);
            }
        }
    }
}
