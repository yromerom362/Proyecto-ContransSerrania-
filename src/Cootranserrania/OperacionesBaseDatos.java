/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cootranserrania;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class OperacionesBaseDatos {
    static Connection con;
    
    public static void conectarBaseDatos() throws Exception {
        con = DriverManager.getConnection("jdbc:h2:~/test\\Users\\TG&S\\Documents\\NetBeansProjects\\Coontranserrania", "sa", "");
    }
    
    public static void desconectarBD() throws SQLException {
        con.close();
    }
    
    public static void insertarConductor(int identificacion, String nombre) throws SQLException {
        String SQL = "INSERT INTO CONDUCTOR VALUES (?, ?)";
        PreparedStatement s = con.prepareStatement(SQL);
        
        s.setInt(1, identificacion);
        s.setString(2, nombre);
        
        s.executeUpdate();
        s.close();
    }
       public static void insertarCarros(String placa, String tipo_carros) throws SQLException {
        String SQL = "INSERT INTO CARROS VALUES (?, ?)";
        PreparedStatement s = con.prepareStatement(SQL);
        
        s.setString(1,placa);
        s.setString(2, tipo_carros);
        
        s.executeUpdate();
        s.close();
    }
       
       
    public static ResultSet obtenerConductores() throws Exception {
        String SQL = "SELECT * FROM CONDUCTOR";
        Statement s = con.createStatement();
        return s.executeQuery(SQL);
    }
    
      public static ResultSet obtenerCarros() throws Exception {
        String SQL = "SELECT * FROM CARROS";
        Statement s = con.createStatement();
        return s.executeQuery(SQL);
    }  
      
    public static void borrarConductores(int identificacion) throws Exception {
        String SQL = "DELETE FROM CONDUCTOR WHERE identificación = ?";
        PreparedStatement s = con.prepareCall(SQL);
        
        s.setInt(1, identificacion);
        
        s.executeUpdate();
        s.close();
    }
    public static void borrarCarros(String placa) throws Exception {
        String SQL = "DELETE FROM CARROS WHERE placa = ?";
        PreparedStatement s = con.prepareCall(SQL);
        
        s.setString (1, placa);
        
        s.executeUpdate();
        s.close();
    }
}
