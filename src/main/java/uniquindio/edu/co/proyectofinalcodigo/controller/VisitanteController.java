package uniquindio.edu.co.proyectofinalcodigo.controller;

import uniquindio.edu.co.proyectofinalcodigo.model.Notificacion;
import uniquindio.edu.co.proyectofinalcodigo.model.Parque;
import uniquindio.edu.co.proyectofinalcodigo.model.Ticket;
import uniquindio.edu.co.proyectofinalcodigo.model.Visitante;
import java.time.LocalDateTime;

public class VisitanteController {

    private Parque parque;

    public VisitanteController(Parque parque) {
        this.parque = parque;
    }

    /**
     * Regla 3: Verifica el aforo antes de vender la entrada y registrar al visitante.
     */
    public boolean comprarEntrada(Visitante visitante, Ticket ticket) {
        if (parque.verificarAforoGlobal()) {
            visitante.setTicket(ticket);
            parque.registrarVisitante(visitante);

            double costoFinal = ticket.calcularCostoFinal(); // ¡Aquí actúa el Polimorfismo!
            System.out.println("Entrada vendida a " + visitante.getNombre() + " por $" + costoFinal);
            System.out.println("Beneficios: " + ticket.obtenerBeneficios());
            return true;
        } else {
            System.out.println("Venta rechazada: El parque ha alcanzado su aforo máximo.");
            return false;
        }
    }

    /**
     * Crea y envía una notificación (simulada por consola por ahora).
     */
    public void enviarNotificacion(String mensaje) {
        Notificacion notificacion = new Notificacion(mensaje, LocalDateTime.now());
        System.out.println("[\uD83D\uDD14 NOTIFICACIÓN " + notificacion.fecha().toLocalTime() + "]: " + notificacion.mensaje());
    }
}
