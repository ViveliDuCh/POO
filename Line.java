/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author evabeltran
 */
public class Line extends Shape{
    

    private Line2D linebuffer;
    private List<Line2D> lineContainer = new ArrayList();
    private List<Integer> positions = new ArrayList();
    private List<Color> colors = new ArrayList();
   
    
    
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*canvas.update(g2);
            xEnd = evt.getX();
            yEnd = evt.getY();*/
        this.xStart = xStart;
        this.yStart = yStart;
            g2.setColor(color);
            linebuffer = new Line2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            g2.draw(linebuffer);
            
    }

    @Override
    public void finishDrawing(int xEnd, int yEnd, Graphics2D g2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*canvas.update(g2);
            xEnd = evt.getX();
            yEnd = evt.getY();*/
            g2.setColor(color);
            linebuffer = new Line2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            lineContainer.add(linebuffer);
            positions.add(lineContainer.size());
            colors.add(color);
    }

    @Override
    public void drawAll(Graphics2D g2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        g2.setColor(color);
        int i = 0;
        for (int x = 0; x < lineContainer.size(); x++)
         {
             g2.draw(lineContainer.get(x));
             
         }
    }

    /*@Override
    public void reset(JPanel canvas, MouseEvent evt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        canvas.update(g2);
        lineContainer.clear();
    }*/
    
}
