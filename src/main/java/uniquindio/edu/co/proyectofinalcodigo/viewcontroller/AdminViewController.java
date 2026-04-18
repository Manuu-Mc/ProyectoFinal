package uniquindio.edu.co.proyectofinalcodigo.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import uniquindio.edu.co.proyectofinalcodigo.controller.AdminController;
import uniquindio.edu.co.proyectofinalcodigo.model.Parque;

public class AdminViewController {

    // 1. Instancia del controlador lógico que creamos en el paso anterior
    private AdminController adminController;
    private Parque parque;

    // 2. Elementos gráficos conectados a tu archivo FXML
    @FXML
    private Button btnAlertaClimatica;

    @FXML
    private Label lblEstadoSistema;

    /**
     * Este método se ejecuta automáticamente al cargar la ventana.
     * Aquí inicializamos nuestro controlador lógico.
     */
    @FXML
    public void initialize() {
        // En un proyecto real, el Parque suele venir de la clase Main (App),
        // pero aquí lo instanciamos para el ejemplo.
        this.parque = new Parque("Tech-Park UQ", 5000);
        this.adminController = new AdminController(parque);
    }

    /**
     * Método que se ejecuta cuando el usuario hace clic en el botón "Activar Alerta".
     */
    @FXML
    public void activarAlertaAction(ActionEvent event) {
        // Llamamos a la lógica de negocio que ya programaste
        adminController.activarAlertaClimatica();

        // Actualizamos la interfaz gráfica
        lblEstadoSistema.setText("¡Alerta Climática Activada! Atracciones cerradas.");
        lblEstadoSistema.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
    }
}
