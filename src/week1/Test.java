/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        LightBulb lb1 = new LightBulb();
        LightBulb lb2 = new LightBulb();

        lb1.turnOn();
        lb2.turnOff();

        lb1.displayLight();
        lb2.displayLight();
    }
}

