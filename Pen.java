/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author evabeltran
 */
public class Pen extends lineTool{
    public void setColor(Color newColor){
        color = newColor;
    }
    
    public void drawAll(Graphics2D g2) {
        g2.setColor(color);
        super.drawAll(g2);
    }
}
