
import javax.swing.*;
import java.awt.*;



public class Hauptmenue {

    public void hauptmenue() {

        JFrame frame = new JFrame();
        JButton button1 = new JButton();

        ImageIcon image = new ImageIcon(getClass().getResource("Unbennant.png"));
        JLabel label = new JLabel(image);


        frame.setSize(500, 500);
        frame.setTitle("Hauptmenü");
        frame.setBackground(Color.red);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 500, 500);
        frame.setResizable(false);
        frame.setVisible(true);
    }




}
