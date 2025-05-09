package Trimestre2ExamenPractica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Estudiante {
    private String nombre;
    private int asignaturas;
    private int notas;
    private double[][] calificaciones;
    HashMap<String, ArrayList<Integer>> pepe;

    public Estudiante(String nombre, int asignaturas, int notas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.notas = notas;
        calificaciones = new double[asignaturas][notas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public double[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double[][] calcularPromedioMaterias() {
        double[][] promedio = new double[calificaciones.length][2];
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            suma /= calificaciones[i].length;
            promedio[i][0] = i;
            promedio[i][1] = suma;
            suma = 0;
        }
        System.out.println(Arrays.deepToString(promedio));
        return promedio;
    }
    public double calcularPromedioGeneral() {
        double suma = 0;
        double[][] promedio = calcularPromedioMaterias();
        for (int i = 0; i < promedio.length; i++) {
            for (int j = 0; j < promedio[i].length; j++) {
                suma += promedio[i][j];
            }
        }
        suma /= promedio.length;
        System.out.println(suma);
        return suma;
    }
    public void mostrarCalificaciones() {
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
