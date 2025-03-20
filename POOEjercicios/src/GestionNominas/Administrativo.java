package GestionNominas;

public class Administrativo extends Gestion{
    public Administrativo(String dni,String nombre,double salarioBase,int antiguedad){
        super(dni,nombre,salarioBase,antiguedad);
    }
    public double calcularSalarioFinal(){
        return salarioBase + (antiguedad*20);
    }
}
