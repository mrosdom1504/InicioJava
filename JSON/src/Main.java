import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        // Crear una lista de usuarios
        List<Usuario> usuarios = ingresarUsuarios();

        // Crear un objeto ObjectMapper para convertir a JSON
        ObjectMapper mapper = new ObjectMapper();

        // Activar el formateo bonito para JSON
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // Convertir la lista de usuarios a JSON y escribirla en el archivo
        mapper.writeValue(new File("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\JSON\\usuarios.json"), usuarios);
        System.out.println("Lista de usuarios guardada en JSON.");

        // Leer el JSON y convertirlo de vuelta a una lista de usuarios
        List<Usuario> usuariosLeidos = mapper.readValue(new File("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\JSON\\usuarios.json"),
                mapper.getTypeFactory().constructCollectionType(List.class, Usuario.class));
        System.out.println("Usuarios leídos desde JSON:");
        for (Usuario u : usuariosLeidos) {
            if (u.getEdad()> 30) {
                System.out.println(u);
            }
        }
    }
    public static List<Usuario> ingresarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        System.out.println("Cuantos usuarios desea ingresar?");
        int opcion = sc.nextInt();
        int contador = 0;
        while(opcion > contador){
            contador++;
            System.out.println("Ingrese el nombre del usuario");
            String nombre = sc.next();
            System.out.println("Ingrese el correo del usuario");
            String correo = sc.next();
            System.out.println("Ingrese la edad del usuario");
            int edad = sc.nextInt();
            new Usuario(nombre, correo,edad);
            usuarios.add(new Usuario(nombre, correo,edad));
        }
        return usuarios;
    }
}
