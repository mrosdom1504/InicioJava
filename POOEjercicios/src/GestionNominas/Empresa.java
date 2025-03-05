package GestionNominas;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    static Scanner sc = new Scanner(System.in);
    private int cif;
    private String nombre;
    private ArrayList<Trabajador> trabajadores;

    public Empresa(int cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

}
