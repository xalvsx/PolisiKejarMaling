import greenfoot.*;
import java.awt.Font;

/**
 * Write a description of class Countdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Countdown extends TextClass
{
    /**
     * Act - do whatever the Countdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter=0;
    GreenfootImage img;
    
    public Countdown(int i) {
        GreenfootImage image = new GreenfootImage(100, 100);
        image.setColor(java.awt.Color.black); 
        image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,36)); 
        String tulisan = "";
        if(i!=4) {
            tulisan = i + "....";
        }
        else {
            tulisan = "GO!!";
        }
        image.drawString(tulisan, 16,36);
        setImage(image);
    }
}
