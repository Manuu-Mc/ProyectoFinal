package uniquindio.edu.co.proyectofinalcodigo.model;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombreParque;
    private List<Zona> zonas;
    private List<Visitante> visitantesTotales;
    private List<Empleado> empleados;
    private int aforoMaximoGlobal;

    public Parque(String nombreParque, int aforoMaximoGlobal) {
        this.nombreParque = nombreParque;
        this.aforoMaximoGlobal = aforoMaximoGlobal;
        this.zonas = new ArrayList<>();
        this.visitantesTotales = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // Métodos para agregar entidades a las listas
    public void agregarZona(Zona zona) {
        this.zonas.add(zona);
    }

    public void registrarVisitante(Visitante visitante) {
        this.visitantesTotales.add(visitante);
    }

    public void registrarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    /**
     * Regla 3: Impide venta de entradas si el parque está lleno
     */
    public boolean verificarAforoGlobal() {
        return this.visitantesTotales.size() < this.aforoMaximoGlobal;
    }

    // Getters
    public String getNombreParque() { return nombreParque; }
    public List<Zona> getZonas() { return zonas; }
    public List<Visitante> getVisitantesTotales() { return visitantesTotales; }
    public List<Empleado> getEmpleados() { return empleados; }
    public int getAforoMaximoGlobal() { return aforoMaximoGlobal; }
}