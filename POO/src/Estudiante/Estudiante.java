package Estudiante;

import java.util.Objects;
import java.util.Scanner;

public class Estudiante {
    static Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, matricula);
    }

    public Estudiante registrarEstudiante(){
        System.out.println("Ingresa un nombre del estudiante");
        nombre= sc.nextLine();
        System.out.println("Ingresa un edad del estudiante");
        edad= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa un matricula del estudiante");
        matricula= sc.nextLine();
        return new Estudiante(nombre, edad, matricula);
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
    }
}
