package GestionNominas;

public class Programador extends Informatico{
    public Programador(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
    }
    public double calcularSalarioFinal(){
        return salarioBase * 1.15;
    }
}
