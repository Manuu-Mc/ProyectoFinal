package uniquindio.edu.co.proyectofinalcodigo.controller;

import uniquindio.edu.co.proyectofinalcodigo.model.Atraccion;
import uniquindio.edu.co.proyectofinalcodigo.model.EstadoAtraccion;
import uniquindio.edu.co.proyectofinalcodigo.model.Operador;
import uniquindio.edu.co.proyectofinalcodigo.model.Parque;
import uniquindio.edu.co.proyectofinalcodigo.model.TipoAtraccion;
import uniquindio.edu.co.proyectofinalcodigo.model.Zona;

public class AdminController {

    private Parque parque;

    public AdminController(Parque parque) {
        this.parque = parque;
    }

    /**
     * Acción de emergencia: Cierra todas las atracciones acuáticas o de altura.
     */
    public void activarAlertaClimatica() {
        System.out.println("¡ALERTA CLIMÁTICA ACTIVADA! Cerrando atracciones en riesgo...");

        for (Zona zona : parque.getZonas()) {
            for (Atraccion atraccion : zona.getAtracciones()) {
                if (atraccion.getTipo() == TipoAtraccion.ACUATICA ||
                        atraccion.getTipo() == TipoAtraccion.MECANICA_ALTURA) {

                    atraccion.setEstado(EstadoAtraccion.CERRADA);
                    atraccion.setMotivoCierre("Alerta climática activa.");
                    System.out.println("- " + atraccion.getNombre() + " ha sido CERRADA.");
                }
            }
        }
    }

    /**
     * Asigna un operador a una zona específica.
     */
    public void asignarOperador(Operador operador, Zona zona) {
        operador.setZonaAsignada(zona);
        System.out.println("Operador " + operador.getNombre() + " asignado a la zona " + zona.getNombre());
    }
}
