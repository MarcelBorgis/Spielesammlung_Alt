
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Hauptmenue {
    private GameManager gameManager = new GameManager();

    private JFrame frame = new JFrame();
    private JPanel mainPanel = new JPanel(new FlowLayout());
    private JButton button1 = new JButton();
    private Container container = new Container();

    private ImageIcon image = new ImageIcon("Unbenannt.png");
    private JLabel label = new JLabel(image);
    private JButton spiel1 = new JButton();
    private JButton spiel2 = new JButton();
    private JButton spiel3 = new JButton();
    private JButton exit = new JButton();

    void hauptmenue() {


        spiel1.setText("Tik Tak Toe");
        spiel1.setForeground(Color.white);
        spiel1.setBackground(Color.black);
        spiel1.setFont(new Font("Arial", Font.PLAIN, 40));
        spiel1.setBounds(200,200,10,10);
        spiel1.setVisible(true);
        spiel1.setText("Tik Tak Toe");
        spiel1.addActionListener(e -> gameManager.callTikTakToe());

        spiel2.setForeground(Color.white);
        spiel2.setBackground(Color.black);
        spiel2.setFont(new Font("Arial", Font.PLAIN, 40));
        spiel2.setBounds(200,200,10,10);
        spiel2.setVisible(true);
        spiel2.setText("Jump and Run");
        spiel2.addActionListener(e -> System.out.println("Jump and Run"));

        spiel3.setForeground(Color.white);
        spiel3.setBackground(Color.black);
        spiel3.setFont(new Font("Arial", Font.PLAIN, 40));
        spiel3.setBounds(200,200,10,10);
        spiel3.setVisible(true);
        spiel3.setText("Astroid");
        spiel3.addActionListener(e -> System.out.println("Astroid"));

        exit.setForeground(Color.RED);
        exit.setBackground(Color.black);
        exit.setFont(new Font("Arial", Font.PLAIN, 40));
        exit.setBounds(200,200,10,10);
        exit.setVisible(true);
        exit.setText("EXIT");
        exit.addActionListener(e -> System.exit(420));

        label.setText("Hauptmenue");
        label.setBounds(200,0,100,100);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setVisible(true);

        mainPanel.setVisible(true);
        mainPanel.setBounds(0,0,500,500);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridLayout(5,4));
        mainPanel.add(label);
        mainPanel.add(spiel1);
        mainPanel.add(spiel2);
        mainPanel.add(spiel3);
        mainPanel.add(exit);

        frame.setTitle("Hauptmenü");
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 500, 500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(mainPanel);
    }

    public void setSpiel1Listener(ActionListener action){
        spiel1.addActionListener(action);
    }

    public void setExitListener(ActionListener action){
        exit.addActionListener(action);
    }
}