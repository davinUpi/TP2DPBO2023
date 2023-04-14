/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package objects;

/**
 *
 * @author User
 */
public enum FigureType {
    ONE_SEVENTH_SCALE,
    NENDOROID,
    POP_UP_PARADE,
    FIGMA;
    
    public String getStringVal(){
        return switch (this) {
            case ONE_SEVENTH_SCALE -> "1/7th Scale";
            case NENDOROID -> "Nendoroid";
            case POP_UP_PARADE -> "Pop Up Parade";
            case FIGMA -> "Figma";
            default -> null;
        };
    }
}
