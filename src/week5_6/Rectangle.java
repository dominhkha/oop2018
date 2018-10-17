/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.Random;

/**
 * Viết class Rectangle thừa kế class Point
 * @author dominhkha
 */
public class Rectangle extends Shape{
    private Point leftAbove;
    private Point rightUnder;
   
    public Rectangle(){
        leftAbove = new Point();
        rightUnder = new Point();
    }

    
    public Point getLeftAbove() {
        return leftAbove;
    }

    public void setLeftAbove(Point leftAbove) {
        this.leftAbove = leftAbove;
    }

    public Point getRightUnder() {
        return rightUnder;
    }

    public void setRightUnder(Point rightUnder) {
        this.rightUnder = rightUnder;
    }
  
    
    public int solvePetermeter(){
        int a = leftAbove.getY()-rightUnder.getY();
        int b= rightUnder.getX()-leftAbove.getX();
        a=Math.abs(a);
        b=Math.abs(b);
        return 2*(a+b);
    }
    public void moveTo(Point leftAbove1, Point rightUnder1){
        this.leftAbove.moveTo(leftAbove1.getX(),leftAbove1.getY());
        this.rightUnder.moveTo(rightUnder.getX(), rightUnder.getY());
    }
    public void moveToRandom(){
        leftAbove.moveToRandomm();
        rightUnder.moveToRandomm();
        if(leftAbove.getX()>rightUnder.getX()||leftAbove.getY()<rightUnder.getY()){
            Point p = leftAbove;
            leftAbove = rightUnder;
            rightUnder = p;
            
        }
        
    }
    public int solveArea(){
        int a = leftAbove.getY()-rightUnder.getY();
        int b= rightUnder.getX()-leftAbove.getX();
        a=Math.abs(a);
        b=Math.abs(b);
        return a*b;
    }
    public String toString(){
        return "Rectangle";
    }
}
