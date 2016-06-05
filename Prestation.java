package com.initial;

/**
 * Created by Ludwig Roger on 23/04/2016.
 */

public class Prestation {
    private String codePrestation, libelle;
    private float prixUnitaire;
    private boolean actif;

    public Prestation(String codePrestationP, String libelleP, float prixP, boolean actifP){
        codePrestation = codePrestationP;
        libelle = libelleP;
        prixUnitaire = prixP;
        actif = actifP;
    }

    public String toString(){
        return codePrestation + " " + libelle + " " + prixUnitaire;
    }

    public float getPrixUnitaire(){
        return prixUnitaire;
    }
    public String getCodePrestation(){
        return codePrestation;
    }
    public String getLibelle(){
        return libelle;
    }
}

