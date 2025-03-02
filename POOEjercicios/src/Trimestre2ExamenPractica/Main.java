package Trimestre2ExamenPractica;

public class Main {
    public static void main(String[] args) {
        double[][] calificaciones = {
            {0, 9, 8},
            {1, 8, 7},
            {2, 7, 6},
            {3, 6, 5},
            {4, 5, 4}
        };
        Estudiante e = new Estudiante("Juan", calificaciones);
        e.calcularPromedioMaterias();
        e.calcularPromedioGeneral();
        e.mostrarCalificaciones();
    }
}
