import greenfoot.*;

/**
 * Write a description of class TombolMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolMenuUtama extends Actor
{
    /**
     * Act - do whatever the TombolMainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        // Add your action code here.
         
    } 
    
    public void TombolHover()
    {
        //MouseInfo mouseOver = Greenfoot.getMouseInfo();  
        GreenfootImage image = getImage();
        boolean mouseOver = false;
        
       if(Greenfoot.mouseMoved(null))
        mouseOver = Greenfoot.mouseMoved(this);
        
       if(mouseOver) 
        image.scale(350,125);
       else if(!Greenfoot.mouseMoved(this))
        image.scale(325,100);
    }
}
