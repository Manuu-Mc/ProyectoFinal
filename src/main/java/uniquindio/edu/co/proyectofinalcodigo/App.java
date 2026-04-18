package uniquindio.edu.co.proyectofinalcodigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // AQUÍ ESTABA EL ERROR: Cambiamos "hello-view.fxml" por "/AdminView.fxml"
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AdminView.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tech-Park UQ - Administración");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
