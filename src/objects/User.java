/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author User
 */
public class User {
    
    private int id;
    private String name;
    private String pass;
    
    public User(){}
    
    public User(int id, String name, String pass){
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPass(){
        return pass;
    }
    
}
