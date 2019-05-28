/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LightBulb {
    private boolean light; //on or off
    public void turnOn(){
        light = true;
        System.out.println("The light is ON");
        
    }
    public void turnOff() {
        light = false;
        System.out.println("The light is OFF");
        
    }
    public void displayLight(){
        System.out.println("The light is: " + light);
    }
   
}
