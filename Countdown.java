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
    
    public Countdown() {
        img = new GreenfootImage(450, 60); 
        img.setColor(java.awt.Color.white); 
        img.setFont(new java.awt.Font("Arial Black",java.awt.Font.PLAIN,20)); 
        img.drawString("1...", 450, 350);
        setImage(img);
            //System.out.println("masuk");
    }
    
    public void act() 
    {
        counter++;
        if(counter==40) {
            Game game = (Game)getWorld();
            game.setActive();
        }
        /*
        if(counter==10) {
           
        }
        else if(counter==20) {
            img.drawString("2...", 400, 350);
            setImage(img);
        }
        else if(counter==30) {
            img.drawString("3...", 400, 350);
            setImage(img);
        }
        else if(counter==40) {
            img.drawString("GO...!!", 400, 350);
            setImage(img);
            Game game = (Game)getWorld();
            game.setActive();
            game.removeObject(this);
        }
        */
    }    
}
