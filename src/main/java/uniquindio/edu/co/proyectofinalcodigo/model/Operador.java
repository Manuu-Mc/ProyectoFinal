package uniquindio.edu.co.proyectofinalcodigo.model;

public class Operador extends Empleado {
    private Zona zonaAsignada;

    public Operador(String nombre, String documento, String idEmpleado, Zona zonaAsignada) {
        super(nombre, documento, idEmpleado);
        this.zonaAsignada = zonaAsignada;
    }

    /**
     * Permite al operador cambiar el estado de una atracción de su zona[cite: 68, 70].
     */
    public void cambiarEstadoAtraccion(Atraccion a, EstadoAtraccion estado) {
        // La lógica de validación de zona se debe manejar aquí o en el controlador [cite: 88]
        a.setEstado(estado);
    }

    public Zona getZonaAsignada() { return zonaAsignada; }
    public void setZonaAsignada(Zona zonaAsignada) { this.zonaAsignada = zonaAsignada; }
}