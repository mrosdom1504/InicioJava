package Trimestre2ExamenPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeCalificaciones {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public GestorDeCalificaciones() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre) {
        System.out.println("Asignaturas: ");
        int asignaturas = sc.nextInt();
        System.out.println("Calificaciones: ");
        int notas = sc.nextInt();
        this.estudiantes.add(new Estudiante(nombre, asignaturas, notas));
    }
    public void promedioAprobado(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getNombre().equals(nombre)){
                if(estudiante.calcularPromedioGeneral()>=5){
                    System.out.println("Estudiante aprobado");
                }
                else {
                    System.out.println("Estudiante suspenso");
                }
            }
        }
    }
    public void mejorEstudiante(String nombre) {
        double mejorNota = 0;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.calcularPromedioGeneral()<mejorNota){
                mejorNota = estudiante.calcularPromedioGeneral();
            }
        }
    }
}
