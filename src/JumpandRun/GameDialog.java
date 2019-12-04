package JumpandRun;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameDialog extends Stage {

    private Text textQuestion = new Text();
    private Text textActualAnswer = new Text();

    public GameDialog() {
        textActualAnswer.setVisible(true);

        VBox vbox = new VBox(10, textQuestion, textActualAnswer);
        Scene scene = new Scene(vbox);

        setScene(scene);
        initModality(Modality.APPLICATION_MODAL);
    }

    public void open() {
        Mains mains = new Mains();

        textQuestion.setText("Dein Score ist " + mains.scoreP1);
        textActualAnswer.setVisible(false);

        show();
    }
}