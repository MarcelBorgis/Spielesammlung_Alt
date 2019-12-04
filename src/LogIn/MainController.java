package LogIn;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class MainController {
    boolean fehler = false;
    @FXML
    private Label anmeldungen;
    @FXML
    private Label anmeldungentip;
    @FXML
    private Label anmeldungentip2;
    @FXML
    private javafx.scene.control.TextField txtBenutzername;
    @FXML
    private javafx.scene.control.TextField txtPasswort;


    public void Login(javafx.event.ActionEvent event) {
        if (txtBenutzername.getText().equals("Momo") && txtPasswort.getText().equals("passwort")) {
            anmeldungen.setText("Anmeldung erfolgreich");
        } else {
            anmeldungen.setText("Anmeldung fehlgeschlagen");
            fehler = true;
            if (txtBenutzername.getText().equals("Yannick") && txtPasswort.getText().equals("passwort")) {
                anmeldungen.setText("Anmeldung erfolgreich");
            } else {
                anmeldungen.setText("Anmeldung fehlgeschlagen");
                fehler = true;
                if (txtBenutzername.getText().equals("Tamara") && txtPasswort.getText().equals("passwort")) {
                    anmeldungen.setText("Anmeldung erfolgreich");
                } else {
                    anmeldungen.setText("Anmeldung fehlgeschlagen");
                    fehler = true;
                }
                if (fehler){
                    anmeldungentip.setText("Benutzername oder Passwort ist falsch");
                    anmeldungentip2.setText("Achten Sie auf Groß- und Kleinschreibung");
                }
            }
        }
    }
}