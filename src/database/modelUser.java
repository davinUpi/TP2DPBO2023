/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import objects.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class modelUser extends DbConnector {
    
    public modelUser(){super();}
    
    public ArrayList<User> getUsers(){
        String query = "SELECT * FROM users";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                ArrayList<User> manufList = new ArrayList();
                while(temp.next()){
                    int id = temp.getInt("user_id");
                    String name = temp.getString("user_name");
                    String pass = temp.getString("user_pass");
                    manufList.add(new User(id, name, pass));
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
    
    public User getUser(int input_id){
        
        String query = "SELECT * from users where user_id = "+input_id;
        ResultSet temp = select(query);
        if(temp != null){
            try{
                temp.first();
                int id = temp.getInt("user_id");
                String name = temp.getString("user_name");
                String pass = temp.getString("user_pass");
                return new User(id, name, pass);
            } catch (SQLException e){
                return null;
            }
            }
        else{
            return null;
        }
    }
    
    public User getUser(String input_name){
        
        String query = "SELECT * from users where user_name = '"+input_name+"'";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                temp.first();
                int id = temp.getInt("user_id");
                String name = temp.getString("user_name");
                String pass = temp.getString("user_pass");
                return new User(id, name, pass);
            } catch (SQLException e){
                System.out.println(e.getMessage());
                return null;
            }
            }
        else{
            return null;
        }
    }
    
    public int insertUser(String input_name, String input_pass){
        String query = "INSERT INTO users(user_name, user_pass) VALUES ('"+input_name+"', '"+input_pass+"')";
        return manipulate(query);
    }
    
}
