package database;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DbConnector {
    
    private final String dbname;
    private final String dbhost;
    private final String dbpass;
    private String dbaddress;
    
    private Connection conn;
    
    public DbConnector(){
        dbname="db_tp2";
        dbhost="root";
        dbpass="";
        dbaddress = "jdbc:mysql://localhost/";
        connect();
    }
    
    private void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            dbaddress = dbaddress + dbname;
            conn = DriverManager.getConnection(dbaddress, dbhost, dbpass);
        } catch (ClassNotFoundException | SQLException e){
        }
    }
    
    protected ResultSet select(String query){
        try{
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    protected int manipulate(String query){
        try{
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
}
