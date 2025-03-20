package GestionInventario;

import java.util.Scanner;

public class GestionInventario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        int codigo;
        int cantidad;

        while (true) {
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Vender un producto");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del producto: ");
                    codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el precio del producto: ");
                    int precio = sc.nextInt();
                    System.out.println("Ingrese la cantidad del mismo: ");
                    cantidad = sc.nextInt();
                    Producto producto = new Producto(codigo, nombre, precio, cantidad);
                    Inventario.agregarProducto(producto);
                    break;
                case 2:
                    Inventario.mostrarInventario();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad del producto: ");
                    cantidad = sc.nextInt();
                    System.out.println("Ingrese el codigo del producto:");
                    codigo = sc.nextInt();
                    Inventario.venderProducto(codigo, cantidad);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
