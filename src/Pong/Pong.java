package Pong;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Pong extends Application {


    private static final int width = 800;
    private static final int height = 600;
    private static final int PLAYER_HEIGHT = 100;
    private static final int PLAYER_WIDTH = 15;
    private static final double BALL_R = 15;
    private int ballYSpeed = 1;
    private int ballXSpeed = 1;
    private double playerOneYPos = height / 2;
    private double playerTwoYPos = height / 2;
    private double ballXPos = width / 2;
    private double ballYPos = height / 2;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private boolean gameStarted;
    private int playerOneXPos = 0;
    private double playerTwoXPos = width - PLAYER_WIDTH;
    private Stage stage = new Stage();


    public void start(Stage stage) throws Exception {
    }

    public void starten() {
        stage.setTitle("P O N G");
        //background size
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        stage.getIcons().add(new Image("File:C:\\Eclipse\\workspace\\Spielesammlung\\src\\images\\icon.png"));
        stage.setResizable(false);

        //JavaFX Timeline = animation definiert von Keyframe und Duration
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));
        //anzahl der Zyklen in der Animaion, unbegrentztes wiederholen
        tl.setCycleCount(Timeline.INDEFINITE);

        //mouse control
        canvas.setOnMouseMoved(e -> playerOneYPos = e.getY());
        canvas.setOnMouseClicked(e -> gameStarted = true);
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }

    private void run(GraphicsContext gc) {
        //grafik
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width, height);


        //text
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font(25));

        if (gameStarted) {
            //ball bewegung
            ballXPos += ballXSpeed;
            ballYPos += ballYSpeed;

            //computer
            if (ballXPos < width - width / 4) {
                playerTwoYPos = ballYPos - PLAYER_HEIGHT / 2;
            } else {
                playerTwoYPos = ballYPos > playerTwoYPos + PLAYER_HEIGHT / 2 ? playerTwoYPos += 1 : playerTwoYPos - 1;
            }
            //ball
            gc.fillOval(ballXPos, ballYPos, BALL_R, BALL_R);

        } else {
            //start text
            gc.setStroke(Color.WHITE);
            gc.setTextAlign(TextAlignment.CENTER);
            gc.strokeText("Click", width / 2, height / 2);

            //reset ball
            ballXPos = width / 2;
            ballYPos = height / 2;

            //reset geschwindigkeit und richtung
            ballXSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
            ballYSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
        }

        //stellt sicher das ball stehen bleibt
        if (ballYPos > height || ballYPos < 0) ballYSpeed *= -1;

        //computer bekommt ein punkt
        if (ballXPos < playerOneXPos - PLAYER_WIDTH) {
            scoreP2++;
            gameStarted = false;
        }

        //der spieler bekommt ein punkt
        if (ballXPos > playerTwoXPos + PLAYER_WIDTH) {
            scoreP1++;
            gameStarted = false;
        }

        //geschwindigkeit wird erhöht, wenn getroffen
        if (((ballXPos + BALL_R > playerTwoXPos) && ballYPos >= playerTwoYPos && ballYPos <= playerTwoYPos + PLAYER_HEIGHT) ||
                ((ballXPos < playerOneXPos + PLAYER_WIDTH) && ballYPos >= playerOneYPos && ballYPos <= playerOneYPos + PLAYER_HEIGHT)) {
            ballYSpeed += 1 * Math.signum(ballYSpeed);
            ballXSpeed += 1 * Math.signum(ballXSpeed);
            ballXSpeed *= -1;
            ballYSpeed *= -1;
        }

        //score
        gc.fillText(scoreP1 + "\t\t\t\t\t\t\t\t" + scoreP2, width / 2, 100);
        // player 1 & 2
        gc.fillRect(playerTwoXPos, playerTwoYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
        gc.fillRect(playerOneXPos, playerOneYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
    }

    public static void main(String[] args) {
        launch(args);
    }
}