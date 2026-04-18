package uniquindio.edu.co.proyectofinalcodigo.model;
import java.util.ArrayList;
import java.util.List;

public class Visitante extends Usuario {
        private int edad;
        private double estatura;
        private double saldoVirtual;
        private List<Atraccion> favoritas;
        private Ticket ticket;

        public Visitante(String nombre, String documento, int edad, double estatura, double saldoVirtual) {
            super(nombre, documento);
            this.edad = edad;
            this.estatura = estatura;
            this.saldoVirtual = saldoVirtual;
            this.favoritas = new ArrayList<>();
        }

        /**
         * Regla de negocio: Descontar del saldo virtual para pagos adicionales[cite: 64, 84].
         */
        public void descontarSaldo(double monto) {
            if (this.saldoVirtual >= monto) {
                this.saldoVirtual -= monto;
            }
        }

        // Getters y Setters
        public int getEdad() {
            return edad; }
        public double getEstatura() {
            return estatura; }
        public double getSaldoVirtual() {
            return saldoVirtual; }
        public List<Atraccion> getFavoritas() {
            return favoritas; }
        public Ticket getTicket() {
            return ticket; }
        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }
}
