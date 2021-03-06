/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.nio.file.Files.delete;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author dominhkha
 */
public class Layer extends JPanel implements ActionListener {

    private int delay = 0;
    protected Timer timer;
    protected Timer timer1;
    private int[] dx;
    private int[] dy;
    private int[] a;
    private int[] b;
    private int[] r;
    private int n;
    private int n1;
    private Shape[] x;
    private Triangle d;
    int d1y=1;
    int d1x =1;
    public static final int MAX =30;
    public Layer() {
        n=0;
        x = new Shape[MAX];
        d = new Triangle(50,210,60,250,70,200);
        x[0] = new Circle(70, 1000, 500);
        x[1] = new Circle(100, 0, 0);
        x[2] = new Circle(50, 300, 500);
        x[3] = new Circle(100, 0, 1000);
        x[4] = new Circle(200, 500, 100);
        x[5] = new Circle(150, 1000, 0);
        x[6] = new Circle(100, 220, 1000);
        x[7] = new Triangle(20,20,40,40,60,60);
        x[8] = new Rectangle();
        x[9] = new Square();
        n1=9;
        
        dx = new int[MAX];
        dy = new int[MAX];
        a = new int[MAX];
        b = new int[MAX];
        r = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            dx[i] = 1;
            dy[i] = 1;
        }
        timer = new Timer(delay, this);
       // timer1 = new Timer(delay, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
       
        repaint();
    }

    public void paintComponent(Graphics g) {
       
        super.paintComponent(g);
        g.setColor(Color.red);
        int[] x1 = {d.getP1().getX(),d.getP2().getX(),d.getP3().getX()};
        int[] y1 = {d.getP1().getY(),d.getP2().getY(),d.getP3().getY()};
      //  for(int i=0;i<2;i++) System.out.println(x1[i]);
        
        
        if(x1[0]<=10||x1[1]<=10||x1[2]<=10){
            d1x = 1;
        }
        else  if(x1[0]>=1000||x1[1]>=1000||x1[2]>=1000){
            d1x =-2;
        }
        if(y1[0]<=10||y1[1]<=10||y1[2]<=10){
            d1y = 1;
        }
        
        else if(y1[0]>=1000||y1[1]>=1000||y1[2]>=1000){
            d1y =-2;
        }
        for(int k =0;k<=2;k++){
            
            x1[k]=x1[k]+d1x;
            y1[k]=y1[k]+d1y;
        }
        d.reset(x1[0],y1[0],x1[1],y1[1],x1[2],y1[2]);

             // int[] x1 = {100,200,300};
       // int[] y1 = {500,700,800};
        g.fillPolygon(x1, y1, 3); 
        for (int i = 0; x[i]!=null; i++) {
            if (x[i] instanceof Circle) {
                a[i] = x[i].getCenter().getX();
                b[i] = x[i].getCenter().getY();
                r[i] = x[i].getLength();
                if (i == 8) {
                    g.setColor(Color.magenta);
                } else if (i == 9) {
                    g.setColor(Color.ORANGE);
                } else if (i == 10) {
                    g.setColor(Color.PINK);
                } else if (i % 3 == 0 && i % 2 == 0) {
                    g.setColor(Color.red);
                } else if (i % 2 == 0) {
                    g.setColor(Color.BLUE);
                } else if (i % 3 == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.YELLOW);
                }

                if (a[i] <= 0) {
                    if (i % 2 == 0) {
                        dx[i] = 1;
                    } else {
                        dx[i] = 2;
                    }
                } else if (a[i] > 1000 - r[i]) {
                    if (i % 2 == 0) {
                        dx[i] = -1;
                    } else {
                        dx[i] = -2;
                    }
                } else if (b[i] <= 0) {
                    if (i % 2 == 0) {
                        dy[i] = 2;
                    } else {
                        dy[i] = 1;
                    }
                } else if (b[i] > 1000 - r[i]) {
                    if (i % 2 == 0) {
                        dy[i] = -2;
                    } else {
                        dy[i] = -2;
                    }
                }
                Point p;
                if(x[i] instanceof Circle){
                    if (a[i] == 0 && b[i] == r[i]) {
                    p = new Point(x[i].getCenter().getX() + dx[i], x[i].getCenter().getY() - dy[i]);
                } else {
                    p = new Point(x[i].getCenter().getX() + dx[i], x[i].getCenter().getY() + dy[i]);
                }

                x[i].setCenter(p);
                g.fillOval(x[i].getCenter().getX(), x[i].getCenter().getY(), x[i].getWidth(), x[i].getWidth());
                if(n1<MAX){
                    if(n1%2==0||n%3==1){
                     x[n1] = new Circle(n1*10,-n1*10-110,+n1*20+120);
                }
                else if(n%3==0){
                    x[n1] = new Circle(n1*7,n1*10+150,-n1*20-150);
                }
                else x[n1] = new Circle(n1*9,-n1*10-100,n1*50);
                }
                else if(n1>=MAX){
                    n1 = 0;
                }
                }
                
               
                
            }
            
        }
          
    }

    public void delTriangle() {
        for (int i = 0; x[i] != null; i++) {
            if (x[i] instanceof Triangle) {
                x[i] = new Shape();
            }

        }
    }

     public void delCircle() {
        for (int i = 0; x[i] != null; i++) {
            if (x[i] instanceof Circle) {
                x[i] = new Shape();
            }
        }
    }
    public void print() {
        for (int i = 0; i < MAX; i++) {
            System.out.println(x[i].toString());
        }
    }
    public void addBall(){
        n1++;
        if(n1>=MAX-1) n1 =1;
       // x[n1] = new Circle(100,100,100);
      //  System.out.println(n1);
         timer.restart();
        
    }
    public static void main(String[] args) {
        Layer lay = new Layer();
        //lay.print();
        lay.delTriangle();
        lay.print();
    }
}
