public class Main {
    public static void main(String[] args) {
        Producto p = new Producto(0, "Lápiz", 0.50, 100);
        ProductoDAO.insertarProducto(p);
    }
}
