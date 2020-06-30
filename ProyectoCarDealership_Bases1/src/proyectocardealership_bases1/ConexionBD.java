
package proyectocardealership_bases1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionBD {
    Connection cn;
    Statement st;
    String databaseName = "proyectobasededatos-281400:us-central1:proyecto-1bases1";
    String url = "jdbc:mysql://35.239.132.203:3306/" + "mydb" + "?autoReconnect=true&useSSL=false";
    String username = "proyecto-1bases1";
    String password = "root";
    public Connection conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
        
}
