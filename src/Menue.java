import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menue {
    private BufferedReader menueAuswahl = new BufferedReader(new InputStreamReader(System.in));

    void menue() throws IOException {
        int nutzerAuswahl;

        System.out.println("--------------Spielesammlung--------------\n");
        System.out.println("Waehlen Sie eins der Spiele aus.\n");
        System.out.println("1. Tic Tac Toe\n");
        System.out.println("2. Jump n Run\n");
        System.out.println("3. Asteroids\n");

        System.out.print("Geben Sie jetzt ihre Zahl ein : ");
        nutzerAuswahl = Integer.parseInt(menueAuswahl.readLine());
        System.out.println(nutzerAuswahl);

    }
}