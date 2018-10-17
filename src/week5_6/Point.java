/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.Random;

/**
 * Viết class Point thể hiện toạ độ của 1 điểm
 * @author dominhkha
 */
public class Point {
    private int x;
    private int y;
    public Point(){
        this.x=1;
        this.y=1;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
    public void moveTo(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void moveToRandomm(){
        Random rad = new Random();
        int a= rad.nextInt(500);
        int b=rad.nextInt(500);
        this.x=a;
        this.y=b;
    }
    
}
