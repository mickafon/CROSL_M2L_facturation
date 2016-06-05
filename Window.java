package com.initial;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lulu on 26/04/2016.
 */

public class Window extends JFrame {
    private JMenuBar menuBar = new JMenuBar();

    private JMenu file = new JMenu("Fichier");
    private JMenuItem print = new JMenuItem("Imprimer");
    private JMenuItem quit = new JMenuItem("Quitter");

    private JMenu ligue =  new JMenu("Ligues");
    private JMenuItem voir_l = new JMenuItem("Voir");
    private JMenuItem rch_l = new JMenuItem("Rechercher");
    private JMenuItem add_l = new JMenuItem("Ajouter");

    private JMenu tresorier = new JMenu("Trésoriers");
    private JMenuItem voir_t = new JMenuItem("Voir");
    private JMenuItem rch_t = new JMenuItem("Rechercher");
    private JMenuItem add_t = new JMenuItem("Ajouter");

    private JMenu presta = new JMenu("Prestations");
    private JMenuItem voir_p = new JMenuItem("Voir");
    private JMenuItem rch_p = new JMenuItem("Rechercher");
    private JMenuItem add_p = new JMenuItem("Ajouter");

    private JMenu facture = new JMenu("Factures");
    private JMenuItem rch_f = new JMenuItem("Rechercher");
    private JMenuItem add_f = new JMenuItem("Nouveau");

    private JMenu apropos = new JMenu("?");
    private JMenuItem app = new JMenuItem("A Propos");




    public Window(){
        this.setTitle("CROSL Facturation");
        this.setSize(800,500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        file.add(print);
        file.add(quit);
        menuBar.add(file);

        ligue.add(voir_l);
        ligue.add(rch_l);
        ligue.add(add_l);
        menuBar.add(ligue);

        tresorier.add(voir_t);
        tresorier.add(rch_t);
        tresorier.add(add_t);
        menuBar.add(tresorier);

        presta.add(voir_p);
        presta.add(rch_p);
        presta.add(add_p);
        menuBar.add(presta);

        facture.add(rch_f);
        facture.add(add_f);
        menuBar.add(facture);

        apropos.add(app);
        menuBar.add(apropos);

        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        JLabel intro = new JLabel("<html><center><h1>CROSL | Maison des Ligues de Lorraine</h1><br/><h2>Application de Facturation</h><br/><i>Ludwig Roger - 2016 - Made in France</i></center></html>");
        panel.setLayout(new GridLayout(1,1));
        intro.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(intro);
        this.add(panel);
    }

}
