/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import objects.Figure;
import objects.Manuf;

/**
 *
 * @author User
 */
public class modelFigure extends DbConnector {
    
    public modelFigure(){
        super();
    }
    
    public ArrayList<Figure> getFigures(){
        String query = "SELECT * FROM figures";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                ArrayList<Figure> figs = new ArrayList();
                while(temp.next()){
                    int id = temp.getInt("figure_id");
                    String name = temp.getString("figure_name");
                    String type = temp.getString("figure_type");
                    String img = temp.getString("figure_img");
                    
                    modelManuf modelMan = new modelManuf();
                    Manuf man = modelMan.getManufacturer(temp.getInt("figure_manufacturer"));
                    figs.add(new Figure(id,name,type,img,man));
                }
                return figs;
            } catch (SQLException e){
                System.out.println(e.getMessage());
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public ArrayList<Figure> getFigures(String name_val){
        String query = "SELECT * FROM figures where figure_name like '%"+name_val+"%'";
        ResultSet temp = select(query);
        if(temp != null){
            try{
                ArrayList<Figure> figs = new ArrayList();
                while(temp.next()){
                    int id = temp.getInt("figure_id");
                    String name = temp.getString("figure_name");
                    String type = temp.getString("figure_type");
                    String img = temp.getString("figure_img");
                    
                    modelManuf modelMan = new modelManuf();
                    Manuf man = modelMan.getManufacturer(temp.getInt("figure_manufacturer"));
                    figs.add(new Figure(id,name,type,img,man));
                }
                return figs;
            } catch (SQLException e){
                System.out.println(e.getMessage());
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public int insertFigure(String name, String type, String img, Manuf man){
        String query = "INSERT INTO figures(figure_name, figure_type, figure_img, figure_manufacturer) values('"+name+"','"+type+"','"+img+"',"+man.getId()+")";
        return manipulate(query);
    }
    
    public int insertFigure(Figure figure){
        String name = figure.getName();
        String type = figure.getType().getStringVal();
        String img = figure.getImg();
        int man = figure.getManufacturer().getId();
        String query = "INSERT INTO figures(figure_name, figure_type, figure_img, figure_manufacturer) VALUES('"
                +name+"', '"+type+"', '"+img+"', "+man;
        return manipulate(query);
    }
    
    public int updateFigure(int id, String name, String type, String img, Manuf man){
        String query = "UPDATE figures set figure_name = '"+name+"', figure_type = '"+type+"', figure_img = '"+img+"', figure_manufacturer = "+man.getId()+" where figure_id = "+id;
        return manipulate(query);
    }
    
    public int updateFigure(Figure figure){
        int id = figure.getId();
        String name = figure.getName();
        String type = figure.getType().getStringVal();
        String img = figure.getImg();
        int man = figure.getManufacturer().getId();
        String query = "UPDATE figures SET figure_name = '"+name+"', figure_type = '"+type+"', figure_img = '"+img+"', figure_manufacturer = "+man+" WHERE figure_id = "+id;
        return manipulate(query);
    }
    
    public int deleteFigure(int id){
        String query = "DELETE FROM figures where figure_id = "+id;
        return manipulate(query);
    }
    
}
