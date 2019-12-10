package Hauptmenu;

import LogIn.Main2;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Object stage;
    private Stage primaryStage;
    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    private Main2 spiele = new Main2();
    private Hauptmenu Hauptmenu = new Hauptmenu();

    @FXML
    private void jumpnrunfenster() throws IOException {

        spiele.jumpNRun();

    }

    @FXML
    private void tiktaktoefenster() throws Exception {
        spiele.tikTakToegame();
    }

    @FXML
    private void pongfenster() throws Exception {
        spiele.pong();
    }

    @FXML
    private void anmelden() throws Exception {
    }
}
