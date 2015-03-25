import greenfoot.*;

/**
 * Write a description of class TombolKarakter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolKarakter2 extends TombolPilihKarakter
{
    /**
     * Act - do whatever the TombolKarakter2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        TombolHover();
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Game(1));
        }
    }    
}
