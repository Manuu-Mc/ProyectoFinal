package uniquindio.edu.co.proyectofinalcodigo.model;

public abstract class Ticket {
    protected String idTicket;
    protected double precioBase;

    public Ticket(String idTicket, double precioBase) {
        this.idTicket = idTicket;
        this.precioBase = precioBase;
    }

    // Métodos Abstractos (Polimorfismo puro)
    public abstract double calcularCostoFinal();
    public abstract String obtenerBeneficios();

    // Getters y Setters
    public String getIdTicket() { return idTicket; }
    public void setIdTicket(String idTicket) { this.idTicket = idTicket; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
}