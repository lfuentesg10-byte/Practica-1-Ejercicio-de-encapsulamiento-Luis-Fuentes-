package modelo;

public class Habitacion {
    private int noHabitacion;
    private double tarifa;
    private String foto;

    public Habitacion(int noHabitacion, double tarifa, String foto) {
        this.noHabitacion = noHabitacion;
        this.tarifa = tarifa;
        this.foto = foto;
    }

    public int getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de habitacion: " + noHabitacion);
        System.out.println("Precio por noche: Q" + tarifa);
        System.out.println("Fotografia: " + foto);
    }
}
