package GestionNominas;

public class Informatico extends Trabajador{
    protected String titulacion;

    public Informatico(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni,nombre,salarioBase);
        this.titulacion = titulacion;
    }

    @Override
    double calcularSalarioFinal() {
        return 0;
    }
}
