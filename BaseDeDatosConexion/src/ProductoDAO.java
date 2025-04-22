import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDAO {
    private static final String URL      = "jdbc:mysql://localhost:3306/Productos";
    private static final String USER     = "appuser";
    private static final String PASSWORD = "AppP4ssw0rd!";

    public static void insertarProducto(Producto producto) {
        String sql = "INSERT INTO Producto (nombre, precio, cantidad) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, producto.getNombre());
            stmt.setDouble(2, producto.getPrecio());
            stmt.setInt(3, producto.getCantidad());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Producto insertado correctamente.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al insertar el producto:");
            e.printStackTrace();
        }
    }
}
