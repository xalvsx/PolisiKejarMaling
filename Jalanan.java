import greenfoot.*;

/**
 * Write a description of class Jalanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jalanan extends Actor
{
    /**
     * Act - do whatever the Jalanan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //System.out.println(this.getY());
        this.setLocation(this.getX(), this.getY() + 2);
        if(this.isAtEdge()) {
            this.setLocation(this.getX(), 0);
        }
    }    
}
