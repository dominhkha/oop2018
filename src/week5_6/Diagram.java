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
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Diagram {
    private Layer ball;
    public Diagram(){
        
        JFrame frame = new JFrame("Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ball = new Layer();
        frame.add(ball);
        frame.setSize(1050, 1050);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
    public static void main(String args[]) {
        new Diagram();
    } 
}


