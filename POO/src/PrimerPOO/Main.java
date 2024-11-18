package PrimerPOO;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("asddfs",21,true,"dshbhs12");
        mostrarPersona(persona1);
    }
    public static void mostrarPersona(Persona persona1) {
        System.out.println(persona1.toString());
        persona1.setNombre("Pepe");
        System.out.println(persona1.toString());
    }
}
