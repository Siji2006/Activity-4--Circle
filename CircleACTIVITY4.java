/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
 */ 
/** 
 * 
 * @author sijitsu
 */ 
public class Circle { 
     
    private double radius; 
 
    // Default constructor with default radius 
    public Circle() { 
        this.radius = 8.5; // Example default radius 
    } 
 
    // Constructor with user-defined radius 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
 
    public double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
 
    public double circumference() { 
        return 2 * Math.PI * radius; 
    }    
    public double arearadii (double radi){ 
