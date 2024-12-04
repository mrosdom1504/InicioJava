package POO1.POO1_Ej12;

import java.util.Objects;

public class Revista extends Libro{
    /*ISBN, el título, y el año de publicación*/
    private int anioPublicacion2;
    private static int numeroRevista=0;

    public Revista(String titulo, String isbn, int anioPublicacion, int anioPublicacion2) {
        super(titulo, isbn, anioPublicacion);
        this.anioPublicacion2 = anioPublicacion2;
        numeroRevista++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion2() {
        return anioPublicacion2;
    }
    public void setAnioPublicacion2(int anioPublicacion2) {
        this.anioPublicacion2 = anioPublicacion2;
    }

    public static int getNumeroRevista() {
        return numeroRevista;
    }

    public static void setNumeroRevista(int numeroRevista) {
        Revista.numeroRevista = numeroRevista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revista revista = (Revista) o;
        return anioPublicacion == revista.anioPublicacion && anioPublicacion2 == revista.anioPublicacion2 && Objects.equals(titulo, revista.titulo) && Objects.equals(isbn, revista.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, isbn, anioPublicacion, anioPublicacion2);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", anioPublicacion2=" + anioPublicacion2 +
                '}';
    }
}
