package GestionNominas;

public class Auxiliar extends Gestion{
    public Auxiliar(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase, antiguedad);
    }
    public double calcularSalarioFinal() {
        return salarioBase + 100;
    }
}
