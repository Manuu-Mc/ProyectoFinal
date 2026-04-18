package uniquindio.edu.co.proyectofinalcodigo.model;

public class TicketFamiliar extends Ticket {
    private double porcentajeDescuento; // Ejemplo: 0.15 para 15%

    public TicketFamiliar(String idTicket, double precioBase, double porcentajeDescuento) {
        super(idTicket, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularCostoFinal() {
        // Aplica el descuento al precio base
        return this.precioBase - (this.precioBase * this.porcentajeDescuento);
    }

    @Override
    public String obtenerBeneficios() {
        return "Permite el ingreso con descuento familiar aplicado.";
    }

    public double getPorcentajeDescuento() { return porcentajeDescuento; }
    public void setPorcentajeDescuento(double porcentajeDescuento) { this.porcentajeDescuento = porcentajeDescuento; }
}
