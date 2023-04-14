/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author User
 */
public class Manuf {
    
    private int id;
    private String name;
    private String img_path;
    private int nFigure;
    
    public Manuf(){}
    
    public Manuf(int id, String name, String img_path){
        this.id = id;
        this.name = name;
        this.img_path = img_path;
    }
    
    public Manuf(int id, String name, String img_path, int n){
        this.id = id;
        this.name = name;
        this.img_path = img_path;
        this.nFigure = n;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setImgPath(String img_path){
        this.img_path = img_path;
    }
    
    public void setNFigure(int n){
        nFigure = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getImgPath(){
        return img_path;
    }
    
    public int getNFigure(){
        return nFigure;
    }
    
}
