package POO1.POO1_Ej18;

public class Incidencia {
    private int incidencia;
    private boolean estaPendiente = false;
    private final int PUESTO;
    private final String DESCRIPCION;
    private String reparacion;
    private static int pendientes;

    public Incidencia(int puesto, String descripcion) {
        this.PUESTO = puesto;
        this.DESCRIPCION = descripcion;
        pendientes++;
        numerarPedidos();
    }

    public int getIncidencia() {
        return incidencia;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        if (estaPendiente) {
            return "Incidencia " + getIncidencia() + " - Puesto: " + PUESTO + " - " + DESCRIPCION + " - Resuelto -" + reparacion;
        } else
            return "Incidencia " + getIncidencia() + " - Puesto: " + PUESTO + " - " + DESCRIPCION + " - Pendiente";
    }

    public void resuelve(String informacion) {
        estaPendiente = true;
        this.reparacion = informacion;
        pendientes--;
    }

    public void numerarPedidos() {
        this.incidencia = pendientes;
    }
}