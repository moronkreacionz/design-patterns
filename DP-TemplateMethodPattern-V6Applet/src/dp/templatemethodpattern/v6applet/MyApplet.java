/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v6applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author moronkreacionz
 */
public class MyApplet extends Applet {

    String message;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    @Override
    public void init() {
        message = "Hello World! I am alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I am starting up";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh! Now I am being stopped.";
        repaint();
    }

    @Override
    public void destroy() {
        message = "Applet is going away";
    }
    @Override
    public void paint(Graphics g){
        g.drawString(message, 5, 15);
    }
}
