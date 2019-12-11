package Hauptmenu;

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

    private Hauptmenu hauptmenu = new Hauptmenu();

    @FXML
    private void jumpnrunfenster() throws IOException {

        hauptmenu.jumpNRun();

    }

    @FXML
    private void tiktaktoefenster() throws Exception {
        hauptmenu.tikTakToegame();
    }

    @FXML
    private void pongfenster() throws Exception {
        hauptmenu.pong();
    }

}
