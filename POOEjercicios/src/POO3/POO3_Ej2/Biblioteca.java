package POO3.POO3_Ej2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Usuario> usuarios;
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Libro> libros) {
        this.usuarios = usuarios;
        this.libros = libros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(usuarios, that.usuarios) && Objects.equals(libros, that.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarios, libros);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "usuarios=" + usuarios +
                ", libros=" + libros +
                '}';
    }
    public void prestarLibro(Usuario usuario) {
        System.out.println("¿Que libro desea pedir?");
        String titulo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                usuario.pedirLibro(libro);
            }
        }
    }
    public void devolverLibro(Usuario usuario) {
        System.out.println("¿Que libro desea devolver?");
        String titulo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                usuario.devolverLibro(libro);
            }
        }
    }
}
