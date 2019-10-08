
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;


public class Hauptmenue {

    public void hauptmenue() {

        TikTakToeListener tListener = new TikTakToeListener();

        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        JButton button1 = new JButton();
        Container container = new Container();

        ImageIcon image = new ImageIcon("Unbenannt.png");
        JLabel label = new JLabel(image);
        JButton spiel1 = new JButton();


        spiel1.setText("Tik Tak Toe");
        spiel1.setForeground(Color.white);
        spiel1.setBackground(Color.black);
        spiel1.setFont(new Font("Arial", Font.PLAIN, 40));
        spiel1.setBounds(200,200,10,10);
        spiel1.setVisible(true);
        spiel1.addActionListener(tListener);

        label.setText("Hauptmenue");
        label.setBounds(200,0,100,100);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setVisible(true);

        mainPanel.setVisible(true);
        mainPanel.setBounds(0,0,500,500);
        mainPanel.setBackground(Color.yellow);
        mainPanel.add(label);
        mainPanel.add(spiel1);

        frame.setTitle("Hauptmenü");
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 500, 500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(mainPanel);

    }




}
