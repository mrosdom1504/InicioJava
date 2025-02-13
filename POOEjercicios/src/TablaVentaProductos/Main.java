package TablaVentaProductos;
/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 *
 */
public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla();
        tabla.introducirDatos();
        tabla.mayorVentas();
        System.out.println(tabla);
    }

}
