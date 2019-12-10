package LogIn;

import JumpandRun.Mains;
import Pong.Pong;
import TikTakToe.TikTakToe;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main2 extends Application {

    private TikTakToe tikTakToe = new TikTakToe();
    private Mains jumpNRuns = new Mains();
    private Pong ponge = new Pong();
    public static void run(String...args ){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();


        primaryStage.setTitle("Hauptmenue");
        primaryStage.setMaxHeight(500);
        primaryStage.setMaxWidth(500);
        stage.setResizable(false);

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

    public void anmeldungsfenster() {

    }


}




