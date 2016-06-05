package initial;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by AFO1SO on 02/06/2016.
 */
public class Tableau extends AbstractTableModel {
    private ArrayList<Tresorier>lesTresoriers = new ArrayList<Tresorier>();
    private boolean actif;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private String [] entetes = {"Civilité", "Nom", "Prenom", "Email", "Telephone"};

    //public Tableau(){

    //}

    public Tableau(ResultSet resultSet){
        this.resultSet = resultSet;
        try{
            this.resultSetMetaData = resultSet.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getColumnCount()
    {
        try
        {
            return resultSetMetaData.getColumnCount();
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int getRowCount()
    {
        try
        {
            resultSet.last();
            return resultSet.getRow();
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        try
        {
            resultSet.absolute( rowIndex + 1 );
            return resultSet.getObject(columnIndex + 1 );
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getColumnName( int column )
    {
        try
        {
            return resultSetMetaData.getColumnName( column + 1 );
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }
    }
    /*
    public void recup(ResultSet result) {
        try {

            ResultSetMetaData resultMeta = result.getMetaData();


            while(result.next()){
                actif = false;
                if(result.getInt("actif") == 1) {
                    actif = true;
                }
                else{
                    actif = false;
                }

                Tresorier tresor = new Tresorier(result.getString("Civilite"), result.getString("Nom"),
                        result.getString("Prenom"), result.getString("Adresse"), result.getInt("CodePostal"), result.getString("Ville"),
                        result.getString("Mail"), result.getString("Telephone"), actif);

                lesTresoriers.add(tresor);
                System.out.println(result.getString("Civilite"));

            }
            result.close();
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void afficher(){

        for(Tresorier tresorier : lesTresoriers){
            System.out.println(tresorier.toString());
        }
    }

    public  ArrayList<Tresorier> getLesTresoriers(){
        return lesTresoriers;
    }

    @Override
    public int getRowCount() {
        return lesTresoriers.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;

            case 1:
                return String.class;

            case 2:
                return String.class;

            case 3:
                return String.class;

            case 4:
                return String.class;

            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // civil
                return lesTresoriers.get(rowIndex).getCivil();

            case 1:
                // Prenom
                return lesTresoriers.get(rowIndex).getNom();

            case 2:
                // Annee
                return lesTresoriers.get(rowIndex).getPrenom();

            case 3:
                // Sexe
                return lesTresoriers.get(rowIndex).getEmail();

            case 4:
                // Note au controle
                return lesTresoriers.get(rowIndex).getTel();

            default:
                throw new IllegalArgumentException();
        }
    }*/
}
