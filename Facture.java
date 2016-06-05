package com.initial;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ludwig Roger on 23/04/2016.
 */

public class Facture {
    private String numeroFacture;
    private Date date, echeance;
    private Ligue uneLigue;
    private float total;
    private ArrayList<Produit> listeProduits = new ArrayList<Produit>();

    public Facture(String numeroP, Date dateP, Date echeanceP){
        numeroFacture = numeroP;
        date = dateP;
        echeance = echeanceP;
    }

    public String toString(){
        return numeroFacture + " " + date + " " + echeance + " " + total + "\n";
    }

    public void setListeProduits(Produit unProduit){
        listeProduits.add(unProduit);
    }
    public void setDate(Date dateP){
        date = dateP;
    }
    public float setTotal(){
        total = 0;
        for(Produit unProduit : listeProduits){
            total = total + unProduit.prixTotal();
        }
        return total;
    }

    public Date getDate(){
        return date;
    }
    public Date getEcheance(){
        return echeance;
    }

    public ArrayList<Produit> listerProduits(){
        return listeProduits;
    }
}
