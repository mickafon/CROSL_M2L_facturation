package com.initial;

import java.util.ArrayList;

/**
 * Created by Ludwig Roger on 23/04/2016.
 */

public class Ligue {
    private String intitule, discipline;
    private int numeroCompte;
    private boolean actif;
    private Tresorier unTresorier;
    private ArrayList<Facture> listeFactures = new ArrayList<Facture>();

    public Ligue(String intituleP, int numeroCompteP, String disciplineP, boolean actifP){
        intitule = intituleP;
        numeroCompte = numeroCompteP;
        discipline = disciplineP;
        actif = actifP;
    }

    public String toString(){
        return numeroCompte + " " + intitule + " " + discipline + "\n";
    }

    public void setActif(boolean actifP){
        actif = actifP;
    }
    public void setUnTresorier(Tresorier tresorier){
        unTresorier = tresorier;
    }
    public void setIntitule(String intituleP){
        intitule = intituleP;
    }
    public void setDiscipline(String disciplineP){
        discipline = disciplineP;
    }
    public void setListeFactures(Facture uneFacture){
        listeFactures.add(uneFacture);
    }

    public ArrayList<Facture> getListeFactures(){
        return listeFactures;
    }
}

