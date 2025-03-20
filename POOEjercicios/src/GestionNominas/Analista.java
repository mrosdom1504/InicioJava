package GestionNominas;

public class Analista extends Informatico{
    public Analista(String dni, String nombre, double salarioBase,String titulacion) {
        super(dni,nombre,salarioBase,titulacion);
    }
    public double calcularSalarioFinal(){
        return salarioBase * 1.30;
    }
}
