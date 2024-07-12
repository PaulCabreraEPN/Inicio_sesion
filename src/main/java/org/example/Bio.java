package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bio {
    public JPanel MainPanel;
    private JButton másButton;
    private JButton cerrarSesionButton;

    public Bio() {
        másButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new Canva().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(550,500);
                frame.setVisible(true);
                ((JFrame)SwingUtilities.getWindowAncestor(másButton)).dispose();
            }
        });
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new login().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(550,500);
                frame.setVisible(true);
                ((JFrame)SwingUtilities.getWindowAncestor(cerrarSesionButton)).dispose();
            }
        });
    }
}
