package com.eddy.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {
    public static void main(String[] args){
        Random random = new Random();
        
        List<String> fortuna  = new ArrayList<>();
        fortuna.add("En el espacio, el sonido no viaja.");
        fortuna.add("Venus gira al revés que la Tierra.");
        fortuna.add("Un día en Venus dura más que un año.");
        fortuna.add("Júpiter tiene una tormenta de 300 años.");
        fortuna.add("La Luna se aleja 3.8 cm cada año.");
        fortuna.add("El Sol es 400 veces más grande que la Luna.");
        fortuna.add("Titán tiene ríos y mares de metano.");
        fortuna.add("Neptuno tiene los vientos más rápidos.");
        fortuna.add("El Monte Olimpo en Marte mide 22 km.");
        fortuna.add("Los astronautas crecen en el espacio.");
        
        JFrame ventana = new JFrame("Rueda de la fortuna");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // Desactivamos el layout por defecto

        JButton btnFortuna = new JButton("Clickeame");
        btnFortuna.setBounds(150, 200, 200, 50); // Posición y tamaño del botón

        btnFortuna.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = random.nextInt(fortuna.size()); // Corrección aquí
                btnFortuna.setText(fortuna.get(index));
            }
        });

        ventana.add(btnFortuna);
        ventana.setVisible(true);
    }
}