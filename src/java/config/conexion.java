
package config;

import java.sql.*;

public class conexion {
    
    Connection con;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca-ufg","root","Fosforo1$");
            System.out.println("Se ha conectado la base de datos exitoramente.-");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        conexion con = new conexion();
        con.getConnection();
    }
}

    
