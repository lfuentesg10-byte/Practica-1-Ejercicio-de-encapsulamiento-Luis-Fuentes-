package modelo;

public class Reservacion {
    private String fechaEntrada;
    private int cantidadDias;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reservacion(String fechaEntrada, int cantidadDias, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.cantidadDias = cantidadDias;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double calcularTotal() {
        return cantidadDias * habitacion.getTarifa();
    }

    public void mostrarInformacion() {
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Cantidad de dias: " + cantidadDias);
        cliente.mostrarInformacion();
        habitacion.mostrarInformacion();
        System.out.println("Total a pagar: Q" + calcularTotal());
    }
}
