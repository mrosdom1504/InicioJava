package Animal;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int tipo;
    private String peso;
    public Animal(String nombre, int tipo, String peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", peso='" + peso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return tipo == animal.tipo && Objects.equals(nombre, animal.nombre) && Objects.equals(peso, animal.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, peso);
    }
    public abstract void comer();
}
