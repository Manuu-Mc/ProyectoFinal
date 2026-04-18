package uniquindio.edu.co.proyectofinalcodigo.model;

public class TicketFastPass extends Ticket {
    private double recargoPremium;

    public TicketFastPass(String idTicket, double precioBase, double recargoPremium) {
        super(idTicket, precioBase);
        this.recargoPremium = recargoPremium;
    }

    @Override
    public double calcularCostoFinal() {
        // El costo final incluye el recargo premium
        return this.precioBase + this.recargoPremium;
    }

    @Override
    public String obtenerBeneficios() {
        return "Permite prioridad en la cola virtual de determinadas atracciones.";
    }

    public double getRecargoPremium() { return recargoPremium; }
    public void setRecargoPremium(double recargoPremium) { this.recargoPremium = recargoPremium; }
}