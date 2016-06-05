package com.database;

import java.sql.*;

/**
 * Created by Lulu on 17/05/2016.
 */

public class Requete {
    private Connexion connexion = new Connexion();
    private Connection connect = connexion.getConnexion();

    public Requete(){

    }

    public void uneRequete(){
        try{
            Statement state = connect.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM tresorier");
            ResultSetMetaData resultMeta = result.getMetaData();

            System.out.println("\n**********************************");
            //On affiche le nom des colonnes
            for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************");

            /*while (result.next()) { //quand on ne connait pas le nom des colonnes...
                for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t" + result.getObject(i).toString() + "\t |");

                System.out.println("\n---------------------------------");

            }
                    // pour les requêtes complexes
                  String query = "SELECT prof_nom, prof_prenom, mat_nom, cls_nom FROM professeur";
                  query += " INNER JOIN j_mat_prof ON jmp_prof_k = prof_id";
                  query += " INNER JOIN matiere ON jmp_mat_k = mat_id";
                  query += " INNER JOIN j_cls_jmp ON jcm_jmp_k = jmp_id";
                  query += " INNER JOIN classe ON jcm_cls_k = cls_id AND cls_id IN(1, 7)";
                  query += " ORDER BY cls_nom DESC, prof_nom";
      */

            while(result.next()){
                System.out.print("\t" + result.getInt("IDTresorier") + "\t |");
                System.out.print("\t" + result.getString("Nom") + "\t |");
                System.out.print("\t" + result.getString("Prenom") + "\t |");
                System.out.println("\n---------------------------------");
            }

            result.close();
            state.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
