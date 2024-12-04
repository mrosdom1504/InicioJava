package POO1.POO1_Ej12;

import java.util.Objects;

public class Libro extends Prestable {
    /*ISBN, el título, y el año de publicación*/
    protected String titulo;
    protected String isbn;
    protected int anioPublicacion;
    private boolean esPrestado = false;

    public Libro(String titulo, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
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

    public boolean isEsPrestado() {
        return esPrestado;
    }

    public void setEsPrestado(boolean esPrestado) {
        this.esPrestado = esPrestado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anioPublicacion == libro.anioPublicacion && esPrestado == libro.esPrestado && Objects.equals(titulo, libro.titulo) && Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, isbn, anioPublicacion, esPrestado);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", esPrestado=" + esPrestado +
                '}';
    }

    public void presta() {
    }
    public void devuelve(){
    }
    public boolean estaPrestado(){
        return esPrestado;
    }
}
