/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author evabeltran
 */
public class FileReaderSer {
    public ImageIcon readIconSerialization(String name) {
        ImageIcon icon = null;
    	try {
    		//Opens file
    		FileInputStream fileIn = new FileInputStream(name + ".ser");
     		ObjectInputStream in = new ObjectInputStream(fileIn);
     		//Retrieves object
                
       		icon = (ImageIcon) in.readObject();
       		//Closes files
    		in.close();
    		fileIn.close();
     	
     	//Catches the errors
      	} catch (IOException e) {
      		e.printStackTrace();
    			
  		}catch (ClassNotFoundException c) {
        	System.out.println("Library class not found");
     		c.printStackTrace();
     		
 		}
        return icon;
    }
    
    public ToolContainer readToolSerialization(String name) {
        ImageIcon icon = null;
        ToolContainer tools = null;
    	try {
    		//Opens file
    		FileInputStream fileIn = new FileInputStream(name + ".ser");
     		ObjectInputStream in = new ObjectInputStream(fileIn);
     		//Retrieves object
                
       		icon = (ImageIcon) in.readObject();
                tools = (ToolContainer) in.readObject();
       		//Closes files
    		in.close();
    		fileIn.close();
     	
     	//Catches the errors
      	} catch (IOException e) {
      		e.printStackTrace();
    			
  		}catch (ClassNotFoundException c) {
        	System.out.println("Library class not found");
     		c.printStackTrace();
     		
 		}
        return tools;
    }
}
