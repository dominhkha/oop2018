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
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Event;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Diagram extends KeyAdapter{
    private Layer ball;
    public Diagram(){
        
        JFrame frame = new JFrame("Ball");
        JButton exit = new JButton();
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ball = new Layer();
        frame.add(ball);
        frame.setSize(1050, 1050);
        String space = KeyEvent.getKeyText(KeyEvent.VK_SPACE);
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
          ball.addBall();
        }
    }
    public void delCircle(){
        ball.delCircle();
    }
    public void print(){
        ball.print();
    }
    public static void main(String args[]) {
       // new Diagram();
        Diagram dia = new Diagram();
       // dia.print();
      //  dia.delCircle();
        dia.print();
    } 
    
    

     
}

    


