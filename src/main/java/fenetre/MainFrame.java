package fenetre;

import javax.swing.*;
import java.awt.*;

public class MainFrame  extends JFrame{

    public MainFrame (){

        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel labelBienvenue = new JLabel("Bienvenue", SwingConstants.CENTER);
        JButton boutonFermer = new JButton("Fermez application");
        boutonFermer.addActionListener(e -> System.exit(0));

        add(labelBienvenue, BorderLayout.CENTER);
        add(boutonFermer, BorderLayout.SOUTH);
    }




    private JPanel MaPremiereAppSwing;
    private JButton fermezApplicationButton;


}
