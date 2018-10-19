/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author dominhkha
 */
public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;
    private Point p1;
    private Point p2;
    private Point p3;
    public Triangle(){
        super();
    }
  /*  public Triangle(int side1,int side2, int side3, int x, int y){
        super(side1, side2, x,y);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
*/
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
    }
    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    public String toString(){
        return "Triangle";
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
    public void reset(int x1, int y1, int x2, int y2, int x3, int y3){
        p1.setX(x1);
        p1.setY(y1);
         p2.setX(x2);
        p2.setY(y2);
         p3.setX(x3);
        p3.setY(y3);
    }
}
