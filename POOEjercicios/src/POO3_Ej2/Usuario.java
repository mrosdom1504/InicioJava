package POO3_Ej2;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Libro> prestamos;

    public Usuario(String nombre, String id, ArrayList<Libro> prestamos) {
        this.nombre = nombre;
        this.id = id;
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Libro> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Libro> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(id, usuario.id) && Objects.equals(prestamos, usuario.prestamos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, prestamos);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
    public void pedirLibro(Libro libro) {
        this.prestamos.add(libro);
        System.out.println("Libro añadido");
    }
    public void devolverLibro(Libro libro) {
        this.prestamos.remove(libro);
        System.out.println("Libro devuelto");
    }
}
