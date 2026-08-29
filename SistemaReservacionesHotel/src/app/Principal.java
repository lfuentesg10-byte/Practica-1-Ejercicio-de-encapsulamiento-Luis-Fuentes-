package app;

import modelo.Cliente;
import modelo.Habitacion;
import modelo.Hotel;
import modelo.Reservacion;

public class Principal {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Las Flores", 4);

        Habitacion habitacion1 = new Habitacion(101, 300, "habitacion101.jpg");
        Habitacion habitacion2 = new Habitacion(102, 350, "habitacion102.jpg");

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        Cliente cliente = new Cliente("Cliente Ejemplo", "Guatemala", "0000-0000");
        Reservacion reservacion = new Reservacion("28/08/2026", 2, cliente, habitacion1);

        System.out.println("INFORMACION DEL HOTEL");
        System.out.println("---------------------");
        hotel.mostrarInformacion();

        System.out.println("\nINFORMACION DE LA RESERVACION");
        System.out.println("-----------------------------");
        reservacion.mostrarInformacion();
    }
}
