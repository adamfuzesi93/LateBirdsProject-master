package hu.unideb.inf.LateBirds;

import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Connect
{
    public Connection conn;
    public ResultSet rs;
    private java.sql.Statement st;

    public Connect()
    {
        try
        {
            String myDriver = "org.h2.Driver";
            String myUrl = "jdbc:h2:file:~/LateBirds";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "user", "user");
            System.out.println("Sikerült a csatlakozas");
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("Hiba történt az adatbázishoz valo csatlakozáskor: " + e.getMessage());
            alert.showAndWait();
        }
    }

    public String[] getData(String select, String from, String where)
    {
        where = " WHERE " + where;
        try
        {
            String query = "SELECT " + select + " FROM " + from + " " + where;
            st = conn.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            String columnName[] = new String[count];
            for (int i = 1; i <= count; i++)
            {
                columnName[i-1] = metaData.getColumnLabel(i);
            }
            return columnName;
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return null;
    }
}