package LogIn;

import Hauptmenu.Hauptmenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import register.Register;

import java.io.IOException;

public class MainController {
    private boolean richtig = false;
    private Hauptmenu haputmenu = new Hauptmenu();
    private Register register = new Register();
    @FXML
    private Label anmeldungen;
    @FXML
    private Button weiterleitungzumHauptmenu;
    @FXML
    private Button regi;
    @FXML
    private javafx.scene.control.TextField txtBenutzername;
    @FXML
    private javafx.scene.control.TextField txtPasswort;


    public void Login(javafx.event.ActionEvent event) throws Exception {
        if (txtBenutzername.getText().equals("Momo") && txtPasswort.getText().equals("passwort")) {
            anmeldungen.setText("Anmeldung erfolgreich");
            richtig = true;
        } else {
            anmeldungen.setText("Anmeldung fehlgeschlagen");
            if (txtBenutzername.getText().equals("Yannick") && txtPasswort.getText().equals("passwort")) {
                anmeldungen.setText("Anmeldung erfolgreich");
                richtig = true;
            } else {
                anmeldungen.setText("Anmeldung fehlgeschlagen");
                richtig = false;
                if (txtBenutzername.getText().equals("Tamara") && txtPasswort.getText().equals("passwort")) {
                    anmeldungen.setText("Anmeldung erfolgreich");
                    richtig = true;
                } else {
                    anmeldungen.setText("Anmeldung fehlgeschlagen");
                    richtig = false;
                }
                if (txtBenutzername.getText().equals("Marcel") && txtPasswort.getText().equals("passwort")) {
                    anmeldungen.setText("Anmeldung erfolgreich");
                    richtig = true;
                } else {
                    anmeldungen.setText("Anmeldung fehlgeschlagen");
                    richtig = false;
                }
            }
        }
    }

    public void haupt() throws IOException {
        if (richtig) {
            haputmenu.starten();
            Main2.stage.close();
        }
        if (!richtig) {

        }
    }

    public void register() throws IOException {
        register.starten();
    }
}
