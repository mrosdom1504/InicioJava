package GestionNominas;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa pepe = new Empresa(12312,"Antonio");
        Trabajador asdas = new Administrativo("sdfdsf", "pepe",12312,22);
        Trabajador kk = new Analista("adsad","sad",12312, "dsafsa");
        System.out.println(kk.calcularSalarioFinal());
        System.out.println(asdas.calcularSalarioFinal());
    }
}
