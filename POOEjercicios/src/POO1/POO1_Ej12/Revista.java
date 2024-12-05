package POO1.POO1_Ej12;

import java.util.Objects;

public class Revista extends Publicacion{
    /*ISBN, el título, y el año de publicación*/
    private int numeroRevista=0;

    public Revista(String titulo, String isbn, int anio, int numeroRevista) {
        super(titulo, isbn, anio);
        this.numeroRevista = numeroRevista;
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

    public void setAnioPublicacion(int anioPublicacion) {
        this.anio = anioPublicacion;
    }


    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Revista revista = (Revista) o;
        return numeroRevista == revista.numeroRevista;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroRevista);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroRevista=" + numeroRevista +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + "}";
    }
}
