/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classandobjects;

import Shapes.Rectangle;
import Shapes.Triangle;

/**
 *
 * @author zhiya
 */
public class ClassAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle tri1 = new Triangle();
        System.out.println(tri1);
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[] sideLengths = new int[18];
        //The lengths of tri1's sides will be first, then the lengths of tri2's sides etc
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        //tri5 (4,7,2)
        sideLengths[12] = 4;
        sideLengths[13] = 7;
        sideLengths[14] = 2;
        
        //we want to set the middle side of each triangle to be 3
        sideLengths[1] = 3;
        sideLengths[4] = 3;
        sideLengths[7] = 3;
        sideLengths[10] = 3;
        sideLengths[13] = 3;
        sideLengths[16] = 3;
        
        Person zhiya = new Person();
     //   zhiya.favTriangle = tri5;
        System.out.println("---Rectangle---");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(True,"Blue",5,6);
        System.out.println(rect1.getArea());
     //   Shape shape1 = newShape();
    System.out.println(rect1.getColour());
        System.out.println(tri5.getColour());
        
        Person p4 = new Person("Sam", 100);
        Person p3 new Person(42,"Ken");
        Person p1 = new Person();
        Person p2 = new Person(5);
        
        Shape s1 = new Shape();
    }
    
}
