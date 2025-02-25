package Practica;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(1,"Coca-Cola", 10.0, 5);
        Producto p2 = new Producto(2,"Pepsi", 8.0, 3);
        Producto p3 = new Producto(3,"Fanta", 7.0, 2);
        Producto p4 = new Producto(4,"Sprite", 9.0, 4);
        Inventario.agregarProducto(p1);
        Inventario.agregarProducto(p2);
        Inventario.agregarProducto(p3);
        Inventario.agregarProducto(p4);
        Inventario.eliminarProducto(2);
        Inventario.eliminarProducto("Fanta");
        Inventario.mostrarInventario();
    }
}
