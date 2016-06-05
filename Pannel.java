package com.initial;

import javax.swing.*;

/**
 * Created by Lulu on 24/05/2016.
 */

public class Pannel extends JPanel{
    private Window window;
    private String texte;
    private JButton bouton = new JButton("Valider");
    private JLabel label = new JLabel("Que faire ?");

    public Pannel(){
        this.add(label);
        this.add(bouton);
    }
}
