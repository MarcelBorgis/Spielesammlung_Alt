import TikTakToe.TikTakToe;

public class GameManager {
    void aufrufe() {
        Hauptmenue hauptmenue = new Hauptmenue();


        hauptmenue.hauptmenue();




    }

    void callTikTakToe(){
        TikTakToe tikTakToe = new TikTakToe();

        tikTakToe.start();
    }
}
