/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.Random;

/**
 * Viết class Circle thừa kế class Layer
 * @author dominhkha
 */
public class Circle extends Shape{
   
    private int radius;
   
    public Circle(){
        
        radius=50;
    }
    public Circle(int radius, int x, int y){
        super(radius, radius,x,y);
        this.radius=radius;
    }
    public int getRadius() {
        return this.getLength();
    }

    public void setRadius(int radius) {
        this.setLength(radius);
        this.setWidth(radius);
    }
    public String toString(){
        return "Circle";
    }
    
    
}
