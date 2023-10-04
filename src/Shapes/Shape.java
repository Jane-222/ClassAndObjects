/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author zhiya
 */
public abstract class Shape {
    
   private String Colour = "Yellow";
   private boolean IsFilled = true;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public boolean isIsFilled() {
        return IsFilled;
    }

    public void setIsFilled(boolean IsFilled) {
        this.IsFilled = IsFilled;
    } 
}
