package uniquindio.edu.co.proyectofinalcodigo.model;

import java.util.LinkedList;
import java.util.Queue;

public class Atraccion implements IMantenimiento {
    private String idUnico;
    private String nombre;
    private TipoAtraccion tipo;
    private int capacidadMaxPorCiclo;
    private double alturaMinima;
    private int edadMinima;
    private double costoExtra;
    private int visitantesAcumulados;
    private EstadoAtraccion estado;
    private String motivoCierre;

    // Colas para manejar la prioridad del Fast-Pass
    private Queue<Visitante> colaGeneral;
    private Queue<Visitante> colaFastPass;

    public Atraccion(String idUnico, String nombre, TipoAtraccion tipo, int capacidadMax,
                     double alturaMinima, int edadMinima, double costoExtra) {
        this.idUnico = idUnico;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaxPorCiclo = capacidadMax;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.costoExtra = costoExtra;
        this.visitantesAcumulados = 0;
        this.estado = EstadoAtraccion.ACTIVA; // Inicia activa por defecto
        this.motivoCierre = "";
        this.colaGeneral = new LinkedList<>();
        this.colaFastPass = new LinkedList<>();
    }

    /**
     * Registra el ingreso de un visitante y verifica si se alcanzó el límite de mantenimiento.
     */
    public void registrarIngreso() {
        this.visitantesAcumulados++;
        if (verificarMantenimiento()) {
            this.estado = EstadoAtraccion.EN_MANTENIMIENTO;
            this.motivoCierre = "Límite de 500 visitantes alcanzado. Requiere revisión técnica.";
        }
    }

    // --- IMPLEMENTACIÓN DE LA INTERFAZ IMantenimiento ---

    @Override
    public boolean verificarMantenimiento() {
        // Regla 5: Mantenimiento preventivo a los 500 visitantes acumulados
        return this.visitantesAcumulados >= 500;
    }

    @Override
    public void registrarRevision() {
        // Un operador registra la revisión y reinicia el ciclo
        this.visitantesAcumulados = 0;
        this.estado = EstadoAtraccion.ACTIVA;
        this.motivoCierre = "";
    }

    // --- GETTERS Y SETTERS ---
    public String getIdUnico() { return idUnico; }
    public String getNombre() { return nombre; }
    public TipoAtraccion getTipo() { return tipo; }
    public double getAlturaMinima() { return alturaMinima; }
    public int getEdadMinima() { return edadMinima; }
    public double getCostoExtra() { return costoExtra; }
    public EstadoAtraccion getEstado() { return estado; }
    public void setEstado(EstadoAtraccion estado) { this.estado = estado; }
    public String getMotivoCierre() { return motivoCierre; }
    public void setMotivoCierre(String motivoCierre) { this.motivoCierre = motivoCierre; }
    public Queue<Visitante> getColaGeneral() { return colaGeneral; }
    public Queue<Visitante> getColaFastPass() { return colaFastPass; }
}