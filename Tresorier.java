package com.initial;

import java.util.ArrayList;

/**
 * Created by Ludwig Roger on 23/04/2016.
 */

public class Tresorier {
    private String nom, prenom, civil, adresse, ville, email, tel;
    private int codePostal;
    private boolean actif;
    private ArrayList<Ligue> listeLigues = new ArrayList<Ligue>();

    public Tresorier(String civilP, String nomP, String prenomP, String adresseP, int cpP, String villeP, String emailP, String telP, boolean actifP){
        civil = civilP;
        nom = nomP;
        prenom = prenomP;
        adresse = adresseP;
        codePostal = cpP;
        adresse = adresseP;
        ville = villeP;
        tel = telP;
        email = emailP;
        actif = actifP;
    }

    public String toString(){
        return civil + " " + nom + " " + prenom + " " + email + " " + tel;
    }

    public void setNom(String nomP){
        nom = nomP;
    }
    public void setAdresse(String adresseP){
        adresse = adresseP;
    }
    public void setCodePostalVille(String villeP, int cpP){
        codePostal = cpP;
        ville = villeP;
    }
    public void setEmail(String mailP){
        email = mailP;
    }
    public void setTel(String telP){
        tel = telP;
    }
    public void setActif(boolean actifP){
        actif = actifP;
    }

    public ArrayList<Ligue> getListeLigues(){
            return listeLigues;
    }
    public String getAdresse(){
        return civil + ". " + nom + " " + prenom + "\n" + adresse + "\n" + codePostal + " " + ville;
    }

    public void addToListeLigues(Ligue uneLigue){
        listeLigues.add(uneLigue);
    }
    public void removeFromListeLigues(Ligue laLigue){
        for(Ligue uneLigue : listeLigues){
            if(uneLigue == laLigue){
                listeLigues.remove(uneLigue);
            }
        }
    }
}
