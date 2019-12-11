package register;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;


public class RegisterController {

    @FXML
    private TextField benutzername;

    @FXML
    private PasswordField passwort;

    @FXML
    private PasswordField passwortconfirmed;

    @FXML
    private Button weiter;

    public void Register(javafx.event.ActionEvent event) throws Exception {
        if (benutzername.getText().length() >= 4) {
        } else {
            System.out.println("Falsch");
        }
        weiter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

    }
}

