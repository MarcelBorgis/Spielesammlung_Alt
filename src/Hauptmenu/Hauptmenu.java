package Hauptmenu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Hauptmenu extends Application {
    private Stage stage = new Stage();

    public void starten() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void start(Stage stage) throws IOException {}
    public static void main(String[] args) {
        launch(args);
    }
}
