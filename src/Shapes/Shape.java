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
    
   protected String colour = "Yellow";
   private boolean IsFilled = true;
   
   public Shape(){
       System.out.println("Shape1");
   }
   public Shape(boolean IsFilled, String colour){
       this.IsFilled = IsFilled;
       this.colour = colour;
       System.out.println("Shape 2");
   }
    public String getColour() {
        return colour;
    }

    public void setColour(String Colour) {
        this.colour = Colour;
    }

    public boolean isIsFilled() {
        return IsFilled;
    }

    public void setIsFilled(boolean IsFilled) {
        this.IsFilled = IsFilled;
    } 
    public abstract double getArea();
}
