package POOAprendizaje.Parte1;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    public void addFigura(Figura f) {
        this.listaFiguras.add(f);
    }

    public void subirPrecio(double precio, String id) {
        for (Figura f : listaFiguras) {
            if (f.getCodigo().equals(id)) {
                f.subirPrecio(precio);
            }
        }
    }

    public void conCapa() {
        ArrayList<String> listaCapa = new ArrayList<>();
        for (Figura f : listaFiguras) {
            if (f.getSuperheroe().isCapa()) {
                listaCapa.add(f.getSuperheroe().getNombre());
            }
        }
    }

    public Figura masValioso() {
        double precio = 0;
        for (Figura f : listaFiguras) {
            if (f.getPrecio() > precio) {
                precio = f.getPrecio();
            }
        }
        for (Figura f : listaFiguras) {
            if (f.getPrecio() == precio) {
                return f;
            }
        }
        return null;
    }

    public double getValorColeccion() {
        double sum = 0;
        for (Figura f : listaFiguras) {
            sum += f.getPrecio();
        }
        return sum;
    }

    public double getVolumenColeccion() {
        double sum = 0;
        for (Figura f : listaFiguras) {
            sum += f.getDimensiones().getVolumen() + 200;
        }
        return sum;
    }
}
