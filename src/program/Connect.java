package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connect {
   private Connection conn;

    public Connect() throws ClassNotFoundException, SQLException {
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:ucanaccess://" + "Database.accdb");
    }
    
    public ResultSet query(String SQL) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);
        return result;
    }
    
    public boolean execute(String SQL) throws SQLException {
        Statement stmt = conn.createStatement();
        boolean result = stmt.execute(SQL);
        return result;
    }
     
    public int update (String SQL) throws SQLException {
        Statement stmt = conn.createStatement();
        int done = stmt.executeUpdate(SQL);
        return done;
    }
    
}
