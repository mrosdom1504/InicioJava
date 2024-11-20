package Cubo;

public class Main {
    public static void main(String[] args) {
        Cubo cubito = new Cubo(5,2);
        Cubo cubazo = new Cubo(5,0);
        cubito.lleno();
        cubito.vuelcaEn(cubazo);
    }
}
