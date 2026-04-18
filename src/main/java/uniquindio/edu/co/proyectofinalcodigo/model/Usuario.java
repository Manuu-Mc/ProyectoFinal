package uniquindio.edu.co.proyectofinalcodigo.model;

public abstract class Usuario {
    protected String nombre;
    protected String documento;

    public Usuario(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    // Getters y Setters con Encapsulamiento [cite: 54]
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
}
