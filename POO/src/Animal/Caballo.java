package Animal;

public class Caballo extends Animal {
    private int patas;
    private String color;
    public Caballo(String nombre, int tipo, String peso, int patas, String color) {
        super(nombre,tipo,peso);
        this.patas = patas;
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void comer(){
        System.out.println("ñam ñam");
    }
}