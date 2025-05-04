/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botoncorreo;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Personal
 */
public class BotonPersonalizado extends JButton {

    // Colores base y efecto hover
    private final Color colorNormal = new Color(70, 130, 180);   
    private final Color colorHover = new Color(100, 100, 100);   

    public BotonPersonalizado() {
        super("Abrir Correo");
        setBackground(colorNormal);
        setForeground(Color.WHITE); // texto en blanco
        setFocusPainted(false);
        setBorderPainted(false);

        // Acción al hacer clic
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnviarCorreo ventanaCorreo = new EnviarCorreo(); 
                ventanaCorreo.setVisible(true); 
            }
        });

        // Efecto al pasar el mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorHover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(colorNormal);
            }
        });
    }
}
