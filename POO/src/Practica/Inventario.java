package Practica;

import java.util.ArrayList;

public class Inventario {
    private static final ArrayList<Producto> productos = new ArrayList<>();

    public static void agregarProducto(Producto p) {
        productos.add(p);
    }
    public static void eliminarProducto(int id) {
        for( Producto producto : productos) {
            if(producto.getId() == id) {
                productos.remove(producto);
                break;
            }
        }
    }
    //Sobrecarga del metodo
    public static void eliminarProducto(String nombre) {
        for( Producto producto : productos) {
            if(producto.getNombre().equals(nombre)) {
                productos.remove(producto);
                break;
            }
        }
    }

    public static void mostrarInventario() {
        for( Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public static void editarProducto(int id, String nombre, double precio, int cantidad) {
        for( Producto producto : productos) {
            if(producto.getId() == id) {
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setCantidad(cantidad);
                break;
            }
        }
    }
}
