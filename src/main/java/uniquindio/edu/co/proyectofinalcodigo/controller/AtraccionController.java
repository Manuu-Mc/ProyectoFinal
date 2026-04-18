package uniquindio.edu.co.proyectofinalcodigo.controller;

import uniquindio.edu.co.proyectofinalcodigo.model.Atraccion;
import uniquindio.edu.co.proyectofinalcodigo.model.EstadoAtraccion;
import uniquindio.edu.co.proyectofinalcodigo.model.IGestionadorAcceso;
import uniquindio.edu.co.proyectofinalcodigo.model.Visitante;

public class AtraccionController implements IGestionadorAcceso {

    @Override
    public boolean validarAcceso(Visitante v, Atraccion a) {
        // 1. Validar que la atracción esté activa
        if (a.getEstado() != EstadoAtraccion.ACTIVA) {
            System.out.println("Acceso denegado: La atracción no está activa.");
            return false;
        }

        // 2. Validar restricciones de seguridad (edad y altura)
        if (v.getEdad() < a.getEdadMinima() || v.getEstatura() < a.getAlturaMinima()) {
            System.out.println("Acceso denegado: El visitante no cumple con los requisitos de seguridad.");
            return false;
        }

        // 3. Validar costo adicional (Regla 4: Saldo virtual)
        if (a.getCostoExtra() > 0) {
            if (v.getSaldoVirtual() >= a.getCostoExtra()) {
                v.descontarSaldo(a.getCostoExtra());
                System.out.println("Se ha descontado " + a.getCostoExtra() + " del saldo virtual.");
            } else {
                System.out.println("Acceso denegado: Saldo virtual insuficiente.");
                return false;
            }
        }

        // Si pasa todas las validaciones, registramos el ingreso en la atracción
        a.registrarIngreso(); // Esto sumará 1 y podría bloquearla si llega a 500
        return true;
    }

    /**
     * Permite a un operador procesar el mantenimiento y reactivar la atracción.
     */
    public void procesarMantenimiento(Atraccion a) {
        if (a.getEstado() == EstadoAtraccion.EN_MANTENIMIENTO) {
            a.registrarRevision(); // Reinicia el contador a 0 y la pone ACTIVA
            System.out.println("Mantenimiento completado. Atracción " + a.getNombre() + " reactivada.");
        }
    }
}