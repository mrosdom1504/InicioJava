package GestionNominas;

public class Gestion extends Trabajador{
    protected int antiguedad;

    public Gestion(String dni,String nombre,double salarioBase,int antiguedad) {
        super(dni, nombre, salarioBase);
        this.antiguedad = antiguedad;
    }

    @Override
    double calcularSalarioFinal() {
        return 0;
    }
}
