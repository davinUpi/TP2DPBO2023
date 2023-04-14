/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import objects.Manuf;

/**
 *
 * @author User
 */
public class modelManuf extends DbConnector{
    
    public modelManuf(){
        super();
    }
    
    public ArrayList<Manuf> getManufacturers(){
        String query = "SELECT * FROM manufacturers";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                ArrayList<Manuf> manufList = new ArrayList();
                while(temp.next()){
                    int id = temp.getInt("manufacturer_id");
                    String name = temp.getString("manufacturer_name");
                    String img = temp.getString("manufacturer_logo");
                    manufList.add(new Manuf(id, name, img));
                }
                return manufList;
            } catch (SQLException e){
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public ArrayList<Manuf> getManufacturersInfo(){
        String query = "SELECT * FROM manufacturer_info";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                ArrayList<Manuf> manufList = new ArrayList();
                while(temp.next()){
                    int id = temp.getInt("manufacturer_id");
                    String name = temp.getString("manufacturer_name");
                    String img = temp.getString("manufacturer_logo");
                    int num = temp.getInt("manufacturer_figures");
                    manufList.add(new Manuf(id, name, img, num));
                }
                return manufList;
            } catch (SQLException e){
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public Manuf getManufacturer(int input_id){
        String query = "SELECT * from manufacturers where manufacturer_id = "+input_id;
        ResultSet temp = select(query);
        if(temp != null){
            try{
                temp.first();
                int id = temp.getInt("manufacturer_id");
                String name = temp.getString("manufacturer_name");
                String img = temp.getString("manufacturer_logo");
                return new Manuf(id, name, img);
            } catch (SQLException e){
                return null;
            }
            }
        else{
            return null;
        }
    }
    
    public Manuf getManufacturer(String input_name){
        String query = "SELECT * from manufacturers where manufacturer_name = '"+input_name+"'";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                temp.first();
                int id = temp.getInt("manufacturer_id");
                String name = temp.getString("manufacturer_name");
                String img = temp.getString("manufacturer_logo");
                return new Manuf(id, name, img);
            } catch (SQLException e){
                e.printStackTrace();
                return null;
            }
            }
        else{
            return null;
        }
    }
    
}
