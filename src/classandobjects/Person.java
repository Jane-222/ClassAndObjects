/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classandobjects;

import Shapes.Triangle;



/**
 *
 * @author zhiya
 */
public class Person {
    int age;
    String name;
    double height;
    private boolean isProgrammer = true;
    private Triangle favTriangle;//favourire triangle 
    
public Person(){
   age = 20;
name = "Michael";
    System.out.println("Constructor 1");
}

public Person(int age){
    this.age = age;
    System.out.println("Constructor 2");
}
public Person(int age, String name){
    this.age = age;
    this.name = name;
    System.out.println("Constructor 3");
}

public Person (String name, int age){
    System.out.println("Constructor 4 ");   
}

}
