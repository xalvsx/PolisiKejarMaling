import greenfoot.*;
import java.util.List;

/**
 * Write a description of class TombolBackToMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolBackToMainMenu extends TombolMenuUtama
{
    /**
     * Act - do whatever the TombolBackToMainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        HoverBackToMenu();
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuUtama());
        }
    }    
    
     public void HoverBackToMenu()
    {
       GreenfootImage image = getImage();
       MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        if (mouse != null) {
            //change the file to what you want for when the mouse is not over the button.
            image.scale(200,59);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), TombolMenuUtama.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    //change the file to what you want for when the mouse is over the button.
                    image.scale(225,84);
                }
            }
        }
    }
}


