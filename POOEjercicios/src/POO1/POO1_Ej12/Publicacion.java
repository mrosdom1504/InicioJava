package POO1.POO1_Ej12;

public class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int anio;

    public Publicacion(String isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", titulo: " + titulo + ", año de publicación: " + anio;
    }
}
