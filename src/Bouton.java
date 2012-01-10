/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */

package Bibliotheque;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JButton;
/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
public class Bouton extends JButton implements MouseListener{
 
     private String name;
     private Image img;
         
     public Bouton(String str){
             super(str);
             this.name = str;
             
             try {
                                 img = ImageIO.read(new File("fondBouton.png"));
                        } catch (IOException e) {
                                e.printStackTrace();
                        }                        
                        this.addMouseListener(this);
     }
    
     public void paintComponent(Graphics g){
                 
            Graphics2D g2d = (Graphics2D)g;
            
            GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
            g2d.setPaint(gp);
            g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
             
            g2d.setColor(Color.black);
            g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
            
     }
 
        /**
         * Mouse click event.
         * @param event 
         */
        public void mouseClicked(MouseEvent event) {
        
        }
 
        /**
         * Mouse entered event.
         * @param event 
         */
        public void mouseEntered(MouseEvent event) 
        {
            try 
            {
                img = ImageIO.read(new File("fondBouton2.png"));
            } 
            catch (IOException e) 
                {
                        e.printStackTrace();
                }      
            }
 
        /**
         * Mouse exited event.
         * @param event 
         */
        public void mouseExited(MouseEvent event) 
        {
            try 
                {
                    img = ImageIO.read(new File("fondBouton.png"));
                } 
                catch (IOException e) 
                    {
                            e.printStackTrace();
                    }      
        }  
        
 
        /**
         * Mouse pressed event.
         * @param event 
         */
        public void mousePressed(MouseEvent event) 
        {
            
        }
 
        /**
         * Mouse released event.
         * @param event 
         */
        public void mouseReleased(MouseEvent event){
                        
        }       
}