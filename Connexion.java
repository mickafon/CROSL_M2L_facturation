package com.database;

import java.sql.*;

/**
 * Created by Lulu on 17/05/2016.
 */

public class Connexion{
    final String driver = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:8889/CROSL_M2L_facturation";
    final String user = "root";
    final String pass = "root";

    public Connexion(){

    }

    public Connection getConnexion(){
        try{
            Class.forName(driver).newInstance();
            Connection connect = DriverManager.getConnection(url ,user ,pass);

            return connect;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
