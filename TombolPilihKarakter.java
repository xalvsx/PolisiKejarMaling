import greenfoot.*;
import java.util.List;

/**
 * Write a description of class TombolPilihKarakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolPilihKarakter extends Actor
{
    /**
     * Act - do whatever the TombolPilihKarakter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void TombolHover()
    {
        GreenfootImage image = getImage();
        //MouseInfo mouseOver = Greenfoot.getMouseInfo();  
        /*GreenfootImage image = getImage();
        boolean mouseOver = false;
        
       if(Greenfoot.mouseMoved(null))
        mouseOver = Greenfoot.mouseMoved(this);
        
       if(mouseOver) 
        image.scale(350,125);
       else if(!Greenfoot.mouseMoved(this))
        image.scale(325,100);
        */
       MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        if (mouse != null) {
            //change the file to what you want for when the mouse is not over the button.
            image.scale(214,159);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), TombolPilihKarakter.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    //change the file to what you want for when the mouse is over the button.
                    image.scale(240,185);
                }
            }
        }
    }
}
