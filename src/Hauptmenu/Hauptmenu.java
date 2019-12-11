package Hauptmenu;
import JumpandRun.Mains;
import Pong.Pong;
import TikTakToe.TikTakToe;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Hauptmenu extends Application {
    private Stage stage = new Stage();

    private TikTakToe tikTakToe = new TikTakToe();
    private Mains jumpNRuns = new Mains();
    private Pong ponge = new Pong();

    public void starten() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Hauptmenü");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void jumpNRun() throws IOException {
        jumpNRuns.spielStarten();
    }

    public void pong() throws Exception {
        ponge.starten();
    }

    public void tikTakToegame() throws Exception {
        tikTakToe.spielStarten();
    }

    public void start(Stage stage) throws IOException {}
    public static void main(String[] args) {
        launch(args);
    }
}
