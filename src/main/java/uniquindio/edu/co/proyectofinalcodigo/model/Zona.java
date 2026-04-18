package uniquindio.edu.co.proyectofinalcodigo.model;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String idZona;
    private String nombre;
    private List<Atraccion> atracciones;
    private int aforoMaximo;
    private int visitantesActuales;

    public Zona(String idZona, String nombre, int aforoMaximo) {
        this.idZona = idZona;
        this.nombre = nombre;
        this.aforoMaximo = aforoMaximo;
        this.atracciones = new ArrayList<>();
        this.visitantesActuales = 0;
    }

    public void agregarAtraccion(Atraccion atraccion) {
        this.atracciones.add(atraccion);
    }

    /**
     * Regla 3: Verifica si hay cupo en la zona antes de permitir el ingreso
     */
    public boolean hayCupo() {
        return this.visitantesActuales < this.aforoMaximo;
    }

    public void registrarIngresoVisitante() {
        if (hayCupo()) {
            this.visitantesActuales++;
        }
    }

    public void registrarSalidaVisitante() {
        if (this.visitantesActuales > 0) {
            this.visitantesActuales--;
        }
    }

    // Getters
    public String getIdZona() { return idZona; }
    public String getNombre() { return nombre; }
    public List<Atraccion> getAtracciones() { return atracciones; }
    public int getAforoMaximo() { return aforoMaximo; }
    public int getVisitantesActuales() { return visitantesActuales; }
}
