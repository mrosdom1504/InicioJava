package Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Estudiante estudiante = new Estudiante("pepe",12,"qwq");
        estudiantes.add(estudiante.registrarEstudiante());
        System.out.println(estudiantes);
        estudiante.mostrarInformacion();
        Estudiante.buscarMatricula(estudiantes);
    }
}
