package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulaireInscription {

    public static void main(String[] args) {
        // Création de la JFrame
        JFrame frame = new JFrame("Formulaire d'inscription");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        JLabel labelNom = new JLabel("Nom:");
        JTextField textFieldNom = new JTextField();
        panel.add(labelNom);
        panel.add(textFieldNom);


        JLabel labelAge = new JLabel("Âge:");
        JTextField textFieldAge = new JTextField();
        panel.add(labelAge);
        panel.add(textFieldAge);


        JButton buttonValider = new JButton("Valider");
        panel.add(buttonValider);


        frame.add(panel);


        buttonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textFieldNom.getText();
                String age = textFieldAge.getText();
                System.out.println("Nom: " + nom + ", Âge: " + age);
            }
        });


        frame.setVisible(true);
    }
}
