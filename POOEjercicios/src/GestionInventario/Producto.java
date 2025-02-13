package GestionInventario;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    Producto(int codigo,String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public void reducirStock(int numero) {
        if(numero <= cantidad) {
            this.cantidad -= numero;
        }else{
            System.out.println("No se pueden vender mas productos de los que hay");
        }
        System.out.println("Cantidad: " + cantidad);
    }

    public void incrementarStock(int cantidad) {
        cantidad += cantidad;
        System.out.println("Cantidad: " + cantidad);
    }
}
