package com.initial;

/**
 * Created by Ludwig Roger on 23/04/2016.
 */

public class Produit {
    private int quantite;
    private Facture laFacture;
    private Prestation unePrestation;

    public Produit(int quantiteP, Facture factureP, Prestation prestationP){
        quantite = quantiteP;
        laFacture = factureP;
        unePrestation = prestationP;
    }

    public String toString(){
        return unePrestation.getCodePrestation() + " " + unePrestation.getLibelle()
                + " " + unePrestation.getPrixUnitaire() + " " + this.quantite + " " + this.prixTotal() + "€ \n";
    }

    public float prixTotal(){
        return quantite * unePrestation.getPrixUnitaire();
    }
    public void ajoutFacture(Facture laFacture){
        laFacture.setListeProduits(this);
    }
}
