/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Shape {
    private String color;
    Point center;
    private int width;
    private int length;
    public Shape(){
        center = new Point();
        color="red";
    }
    public Shape(String color) {
        this.color = color;
    }
    public Shape(int width, int length, int x , int y){
        this.width=width;
        this.length = length;
        center = new Point(x,y);
    }

    public String getColor() {
        return color;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void changeColor(String color){
        this.color=color;
    }
    public void MoveTo(Point p){
        this.center=p;
    }
    public void MoveToRandom(){
        Random rad = new Random();
        int x =0;
        int y=0;
        x=rad.nextInt();
        y= rad.nextInt();
        while(x<0||x>500||y<0||y>500){
            x=rad.nextInt();
            y= rad.nextInt();
        }
        Point p = new Point(x,y);
        this.center = p;
    }
   
    public String toString(){
        return "Shape";
    }
    
}
