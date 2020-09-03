/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JPanel;


/**
 *
 * @author rrshamsutdinov
 */
public class MyPanel extends JPanel{
    private RectangularShape shape;

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }
    Point2D[] point;
    
    public MyPanel(){
        shape = new Ellipse2D.Double();
         point = new Point2D[2];
        addMouseListener(new MouseAdapter(){ 
            @Override
            public void mousePressed(MouseEvent e) {
                point[0] = e.getPoint();
            }
            
        });
        
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                point[1] = e.getPoint();
                shape.setFrameFromDiagonal(point[0], point[1]);
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
            }
        });
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(shape);
    }
    
}
