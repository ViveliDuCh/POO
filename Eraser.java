/*
 * 
 *
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;



/**
 *@date 01/may/2019
 * @author Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description:This class puts by default de color white while drawing, so with the white background this fits as an eraser, painting everything as the canvas. 
 */
//this is a subclass of lineTool
public class Eraser extends lineTool{
    //This is the constructor. 
    public Eraser (){
        //The color is changed to white
        color = Color.WHITE;
    }
    //Here the method drawAll is being overrided
     public void drawAll(Graphics2D g2) {
        g2.setColor(color);
        super.drawAll(g2);
    }
}
