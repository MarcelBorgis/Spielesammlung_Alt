package LogIn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static Stage stage;

    public static void run(String...args ){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);


        primaryStage.setTitle("Anmeldung");
        primaryStage.setMaxHeight(400);
        primaryStage.setMaxWidth(600);
        primaryStage.setResizable(false);

        primaryStage.setScene(scene);
        primaryStage.show();

    }




}




