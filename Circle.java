/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evabeltran
 */
public class Circle extends Shape {
    
    
    private Ellipse2D circbuffer;
    private List<Ellipse2D> circContainer = new ArrayList();
   

    public Circle() {
        //The color by default for the circle is black
        color = Color.black;
    }
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        // The coordinates are being obtained
            this.xStart = xStart;
            this.yStart = yStart;
            g2.setColor(color);
            circbuffer = new Ellipse2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            g2.draw(circbuffer);
    }

    @Override
    public void finishDrawing(int xEnd, int yEnd, Graphics2D g2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*canvas.update(g2);
            xEnd = evt.getX() - xStart;
            yEnd = evt.getY() - yStart;*/
            g2.setColor(color);
            circbuffer = new Ellipse2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            circContainer.add(circbuffer);
    }

    @Override
    public void drawAll(Graphics2D g2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        g2.setColor(color);
        for (int x = 0; x < circContainer.size(); x++)
         {
          g2.draw(circContainer.get(x));
         }
        
        
    }

    /*@Override
    public void reset(JPanel canvas, MouseEvent evt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        canvas.update(g2);
        circContainer.clear();
    }*/
}
