package register;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Register extends Application {

    public void starten() throws IOException {
        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        primaryStage.setTitle("Registrieren");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    }

    public static void main(String[] args) {
        launch(args);
    }
}
