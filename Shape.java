/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author evabeltran
 */
public abstract class Shape implements Tool, java.io.Serializable{
    
    
    protected Graphics2D g2;
    protected int xStart;
    protected int yStart;

    protected Color color;
    
    
    public abstract void finishDrawing(int xEnd, int yEnd, Graphics2D g2);
    
    public void setColor(Color newColor) {
        color = newColor;
    }
    
    public Color getColor() {
        return color;
    }
    
}
