package Trimestre2ExamenPractica;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private double[][] calificaciones;

    public Estudiante(String nombre, double[][] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double[][] calcularPromedioMaterias() {
        double[][] promedio = new double[calificaciones.length][2];
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 1; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            suma /= calificaciones[i].length-1;
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
            for (int j = 1; j < promedio[i].length; j++) {
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
