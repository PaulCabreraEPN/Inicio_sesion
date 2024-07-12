package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public JPanel MainPanel;
    public JTextField usuario;
    public JTextField contrasenia;
    public JPanel iconUser;
    private JButton iniciarSesionButton;
    private JButton cancelarButton;
    private JLabel estado;

    /*Credenciales*/
    String user="Paul_Cabrera";
    String pass="123456";

    public login() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario.setText(null);
                contrasenia.setText(null);
                estado.setText(null);
            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuario.getText().equals(user)){
                    if (contrasenia.getText().equals(pass)){
                        System.out.println("Ingreso Exitoso");
                        estado.setText("Ingresando...");

                        JFrame frame = new JFrame();
                        frame.setContentPane(new Bio().MainPanel);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(550,500);
                        frame.setVisible(true);
                        ((JFrame)SwingUtilities.getWindowAncestor(iniciarSesionButton)).dispose();
                    }else {
                        estado.setText("Contraseña Incorrecta");
                    }
                }else {
                    estado.setText("Usuario Incorrecto");
                }
            }
        });
    }
}
