/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author User
 */
public class Figure {
    
    private int id;
    private String name;
    private FigureType type;
    private String img;
    private Manuf man;
    
    public Figure(){}
    
    public Figure(int id, String name, FigureType type, String img, Manuf man){
        this.id = id;
        this.name = name;
        this.type = type;
        this.img = img;
        this.man = man;
    }
    
    public Figure(int id, String name, String type, String img, Manuf man){
        this.id = id;
        this.name = name;
        this.img = img;
        this.man = man;
        setType(type);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setType(FigureType type){
        this.type =type;
    }
    
    public final void setType(String type){
        for(FigureType i : FigureType.values()){
            if(type.equalsIgnoreCase(i.getStringVal())){
                this.type = i;
                break;
            }
        }
    }
    
    public void setImg(String img){
        this.img = img;
    }
    
    public void setManufacturer(Manuf man){
        this.man = man;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public FigureType getType(){
        return type;
    }
    
    public String getImg(){
        return img;
    }
    
    public Manuf getManufacturer(){
        return man;
    }
    
}
