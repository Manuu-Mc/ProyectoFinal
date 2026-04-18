module uniquindio.edu.co.proyectofinalcodigo {
    requires javafx.controls;
    requires javafx.fxml;

    // Da permiso para que JavaFX lea la clase App y el FXML
    opens uniquindio.edu.co.proyectofinalcodigo to javafx.fxml;
    exports uniquindio.edu.co.proyectofinalcodigo;

    // ¡CRÍTICO! Da permiso para que JavaFX lea tu AdminViewController
    opens uniquindio.edu.co.proyectofinalcodigo.viewcontroller to javafx.fxml;
    exports uniquindio.edu.co.proyectofinalcodigo.viewcontroller;
}