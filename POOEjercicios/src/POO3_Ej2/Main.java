package POO3_Ej2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo las listas y los obejtos
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Libro libro1 = new Libro("pepe","antonio", "asdas",true);
        libros.add(libro1);
        Usuario usuario1 = new Usuario("pepe","asd", libros);
        usuarios.add(usuario1);
        Biblioteca biblioteca = new Biblioteca(usuarios,libros);
        //Usando los metodos creados
        libro1.prestar();
        libro1.devolver();

        usuario1.pedirLibro(libro1);
        usuario1.devolverLibro(libro1);

        biblioteca.devolverLibro(usuario1);
        biblioteca.prestarLibro(usuario1);
    }
}
