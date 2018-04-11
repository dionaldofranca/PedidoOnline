package br.com.dlaine.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() { 
        try {
        	Class.forName("org.postgresql.Driver");
        	String url     = "jdbc:postgresql://localhost:5432/banco_dlaine";      
            String usuario = "postgres";
            String senha   = "7617";
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
        	// throw new RuntimeException(e);
        	System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
        	// throw new RuntimeException(e);
        }
		return null;
    }
    
	public static void close(Connection con) {
        try  {
            con.close();
        }
        catch(Exception ex) {
        }
    }
}
