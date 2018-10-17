/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import static com.oracle.nio.BufferSecrets.instance;
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
    private int[] dx;
    private int[] dy;
    private int[] a;
    private int[] b;
    private int[] r;

    private Shape[] x;

    public Layer() {

        x = new Shape[20];
        x[0] = new Circle(70, 1000, 500);
        x[1] = new Circle(100, 0, 0);
        x[2] = new Circle(50, 300, 500);
        x[3] = new Circle(100, 0, 1000);
        x[4] = new Circle(200, 500, 100);
        x[5] = new Circle(150, 1000, 0);
        x[6] = new Circle(100, 200, 1000);
        x[7] = new Circle(190, 1000, 1000);
        x[8] = new Circle(120, 1000, 0);
        x[9] = new Circle(120, 500, 700);
        x[10] = new Circle(90, 600, 600);
        x[11] = new Triangle();
        x[12] = new Rectangle();
        x[13] = new Square();
        dx = new int[11];
        dy = new int[11];
        a = new int[11];
        b = new int[11];
        r = new int[11];
        for (int i = 0; i < 11; i++) {
            dx[i] = 1;
            dy[i] = 1;
        }
        timer = new Timer(delay, this);

        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        for (int i = 0; x[i]!=null; i++) {
            if (x[i].toString().equals("Circle")) {
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
                if (a[i] == 0 && b[i] == r[i]) {
                    p = new Point(x[i].getCenter().getX() + dx[i], x[i].getCenter().getY() - dy[i]);
                } else {
                    p = new Point(x[i].getCenter().getX() + dx[i], x[i].getCenter().getY() + dy[i]);
                }

                x[i].setCenter(p);
                g.fillOval(x[i].getCenter().getX(), x[i].getCenter().getY(), x[i].getWidth(), x[i].getWidth());
            }
        }

    }

    public void delTriangle() {
        for (int i = 0; x[i] != null; i++) {
            if (x[i].toString().equals("Triangle")) {
                x[i] = new Shape();
            }

        }
    }

    public void print() {
        for (int i = 0; i < 20; i++) {
            System.out.println(x[i].toString());
        }
    }

    public static void main(String[] args) {
        Layer lay = new Layer();
        //lay.print();
        lay.delTriangle();
        lay.print();
    }
}
