package uniquindio.edu.co.proyectofinalcodigo.model;

public class TicketGeneral extends Ticket {

    public TicketGeneral(String idTicket, double precioBase) {
        super(idTicket, precioBase);
    }

    @Override
    public double calcularCostoFinal() {
        // El costo final es igual al precio base
        return this.precioBase;
    }

    @Override
    public String obtenerBeneficios() {
        return "Permite el ingreso normal al parque. Puede requerir saldo extra en atracciones especiales.";
    }
}
