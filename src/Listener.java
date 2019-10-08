import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listener {

    Hauptmenue hauptmenue;

    public void addListener(){
        hauptmenue.setSpiel1Listener(new tListener());
        hauptmenue.setExitListener(new exitlistener());
    }

    class exitlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class tListener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button gedrueckt");
        }
    }
}


