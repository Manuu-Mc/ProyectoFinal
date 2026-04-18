package uniquindio.edu.co.proyectofinalcodigo.model;

public abstract class Empleado extends Usuario {
    protected String idEmpleado;

    public Empleado(String nombre, String documento, String idEmpleado) {
        super(nombre, documento);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() { return idEmpleado; }
}