package POOAprendizaje.Parte4;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double costeMaterial(){
        return (superficie / 7.8) * precioPintura;
    }

    public double costeManoObra(){
        return (superficie / 10) * 9.5;
    }

    public double costeTotal(){
        if(this.superficie<50) {
            double total = costeMaterial() + costeManoObra();
            total += total * 0.15;
            return total;
        }else
            return costeMaterial()+costeManoObra();
    }

    public String detalleServicio(){
        return "TRABAJO DE PINTURA \n"+
               "Cliente: "+getCliente()+"\n"+
               "Fecha de inicio: "+getFechaInicio()+"\n"+
               "---------------------------------------\n"+
               "Pintor: "+getTrabajador()+"\n"+
               "Coste Material..... "+costeMaterial()+"\n"+
               "Coste Mano Obra.... "+costeManoObra()+"\n"+
               "Coste Adicional.... "+costeTotal()+"\n"+
               "TOTAL: ............ "+costeTotal();
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

}
