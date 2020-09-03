/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author rrshamsutdinov
 */
public class Graphic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame GUI;
        MyPanel panel = new MyPanel();
        panel.setShape(new Rectangle2D.Double());
        GUI = new MyFrame(panel);
        
    }
    
}
