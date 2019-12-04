package JumpandRun;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class Mains extends Application {

    private GameDialog dialog = new GameDialog();
    private Stage primaryStage = new Stage();

    private int levelWidth;
    public int scoreP1 = 0;

    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();

    private ArrayList<Node> platforms = new ArrayList<Node>();
    private ArrayList<Node> coins = new ArrayList<Node>();
    private ArrayList<Node> lavapla = new ArrayList<Node>();
    private ArrayList<Node> lava = new ArrayList<Node>();

    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane uiRoot = new Pane();

    private Node player;
    private Point2D playerVelocity = new Point2D(0, 0);

    private boolean canJump = true;
    private boolean punkte = false;

    private Image bloecke = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\bloecke.png");
    private Image coinblocke = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Coinblock.png");
    private Image marioR = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Mario_klein_rechts0.png");
    private Image marioL = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Mario_klein_links0.png");
    private Image lavablock = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Lava.png");
    private Image lavablock2 = new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Lava2.png");
    private ImagePattern imagePatternBloecke = new ImagePattern(bloecke);
    private ImagePattern imagePatterncoin = new ImagePattern(coinblocke);
    private ImagePattern imagePatternlavablock = new ImagePattern(lavablock);
    private ImagePattern imagePatternlavablock2 = new ImagePattern(lavablock2);


    private boolean dialogEvent = false;
    private boolean running = true;

    private void initContent() {

        levelWidth = LevelData.LEVEL1[0].length() * 60;
        for (int i = 0; i < LevelData.LEVEL1.length; i++) {
            String line = LevelData.LEVEL1[i];
            for (int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)) {
                    case '0':
                        break;
                    case '1':
                        Node platform = createEntity(j * 60, i * 60, 60, 60, imagePatternBloecke);
                        platforms.add(platform);
                        break;
                    case '2':
                        Node coin = createEntity(j * 60, i * 60, 60, 60, imagePatterncoin);
                        coins.add(coin);
                        break;
                    case '3':
                        Node lavawelle = createEntity(j * 60, i * 60, 60, 60, imagePatternlavablock);
                        lavapla.add(lavawelle);
                        break;
                    case '4':
                        Node lavasee = createEntity(j * 60, i * 60, 60, 60, imagePatternlavablock2);
                        lava.add(lavasee);
                        break;
                }
            }
        }

        player = createEntity(0, 600, 40, 40, new ImagePattern(marioR));

        player.translateXProperty().addListener((obs, old, newValue) -> {
            int offset = newValue.intValue();

            if (offset > 640 && offset < levelWidth - 640) {
                gameRoot.setLayoutX(-(offset - 640));
            }
        });

        appRoot.getChildren().addAll(gameRoot, uiRoot);
    }

    private void update() {
        if (isPressed(KeyCode.W) && player.getTranslateY() >= 5) {

            jumpPlayer();
        }
        if (isPressed(KeyCode.SPACE) && player.getTranslateY() >= 5) {
            jumpPlayer();
        }

        if (isPressed(KeyCode.A) && player.getTranslateX() >= 5) {
            movePlayerX(-5);
        }

        if (isPressed(KeyCode.D) && player.getTranslateX() + 40 <= levelWidth - 5) {
            movePlayerX(5);
        }

        if (playerVelocity.getY() < 10) {
            playerVelocity = playerVelocity.add(0, 1);
        }

        movePlayerY((int) playerVelocity.getY());

        for (Node coin : coins) {
            if (player.getBoundsInParent().intersects(coin.getBoundsInParent())) {
                System.out.println("Block1");
                coin.getProperties().put("alive", false);
                scoreP1++;
                punkte = true;

            }
        }
        for (Node Lava : lavapla) {
            if (player.getBoundsInParent().intersects(Lava.getBoundsInParent())) {
                dialogEvent = true;

            }
        }

    }

    private void movePlayerX(int value) {
        boolean movingRight = value > 0;

        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (player.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingRight) {
                        if (player.getTranslateX() + 40 == platform.getTranslateX()) {
                            return;
                        }
                    } else {
                        if (player.getTranslateX() == platform.getTranslateX() + 60) {
                            return;
                        }
                    }
                }
            }
            player.setTranslateX(player.getTranslateX() + (movingRight ? 1 : -1));
        }
    }

    private void movePlayerY(int value) {
        boolean movingDown = value > 0;

        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (player.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingDown) {
                        if (player.getTranslateY() + 40 == platform.getTranslateY()) {
                            player.setTranslateY(player.getTranslateY() - 1);
                            canJump = true;
                            return;
                        }
                    } else {
                        if (player.getTranslateY() == platform.getTranslateY() + 60) {
                            return;
                        }
                    }
                }
            }
            for (Node punkte : coins) {
                if (player.getBoundsInParent().intersects(punkte.getBoundsInParent())) {
                    if (movingDown) {
                        if (player.getTranslateY() + 40 == punkte.getTranslateY()) {
                            player.setTranslateY(player.getTranslateY() - 1);
                            canJump = true;
                            scoreP1++;
                            return;
                        }
                    } else {
                        if (player.getTranslateY() == punkte.getTranslateY() + 60) {
                            return;
                        }
                    }
                }
            }
            player.setTranslateY(player.getTranslateY() + (movingDown ? 1 : -1));
        }
    }

    private void jumpPlayer() {
        if (canJump) {
            playerVelocity = playerVelocity.add(0, -30);
            canJump = false;
        }
    }

    private Node createEntity(int x, int y, int w, int h, ImagePattern imagePattern) {
        javafx.scene.shape.Rectangle entity = new javafx.scene.shape.Rectangle(w, h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(imagePattern);
        entity.getProperties().put("alive", true);

        gameRoot.getChildren().add(entity);
        return entity;
    }

    private boolean isPressed(KeyCode key) {
        return keys.getOrDefault(key, false);
    }

    public void spielStarten() {
        initContent();


        Scene scene = new Scene(appRoot);
        scene.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        scene.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        primaryStage.setTitle("Jump and Run");
        primaryStage.getIcons().add(new Image("File:C:\\Eclipse\\workspace\\Spiele\\src\\images\\Mario_klein_links0.png"));
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (running) {
                    update();
                }
                if (punkte) {
                    scoreP1++;
                }
                if (dialogEvent) {
                    dialogEvent = false;
                    keys.keySet().forEach(key -> keys.put(key, false));



                    running = false;
                    dialog.open();
                }

            }

        };
        timer.start();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public static void main(String[] args) {
        launch(args);
    }

    public int getScoreP1() {
        return scoreP1;
    }

    public void setScoreP1(int scoreP1) {
        this.scoreP1 = scoreP1;
    }

}



