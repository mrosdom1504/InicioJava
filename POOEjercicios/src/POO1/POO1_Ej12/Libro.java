package POO1.POO1_Ej12;

import java.util.Objects;

public class Libro extends Publicacion implements Prestable {
    /*ISBN, el título, y el año de publicación*/
    private boolean esPrestado = false;

    public Libro(String titulo, String isbn, int anio) {
        super(titulo,isbn,anio);
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
        return anio;
    }

    public void setAnioPublicacion(int anio) {
        this.anio = anio;
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
        return esPrestado == libro.esPrestado;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(esPrestado);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "esPrestado=" + esPrestado +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public void presta() {
        if(!esPrestado)
            this.esPrestado = true;
        else
            System.out.println("Lo siento, ese libro ya está prestado.");
    }
    public void devuelve(){
        if(esPrestado)
            this.esPrestado = false;
        else
            System.out.println("No está prestado");
    }
    public boolean estaPrestado(){
        return esPrestado;
    }
}
