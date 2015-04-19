import greenfoot.*;

/**
 * Write a description of class TombolStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolStart extends TombolMenuUtama
{
    /**
     * Act - do whatever the TombolStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        TombolHover();
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new StoryBoard());
        }
    }    
}
