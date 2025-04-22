import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjercicioPractico {
    public static void main(String[] args) throws IOException {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(121, "213hjfg",12,1));
        productos.add(new Producto(11, "213hdsjfg",12,1));
        productos.add(new Producto(1, "fg",12,1));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\JSON\\EjercicioPractico.json"), productos);
        System.out.println("Lista de usuarios guardada en JSON.");

        List<Producto> productosLeidos = mapper.readValue(new File("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\JSON\\EjercicioPractico.json"),
                mapper.getTypeFactory().constructCollectionType(List.class, Producto.class));
        for (Producto p : productosLeidos){
            System.out.println(p);
        }
    }
}
