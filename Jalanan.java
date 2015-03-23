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
    private int speed = 2;
    
    public Jalanan(int i) {
        Game game = (Game)getWorld();
        
        if(i==1) {
            speed = 4;
        }
        else if(i==2) speed = 6;
    }
    
    public void act() 
    {
        // Add your action code here.
        //System.out.println(this.getY());
        this.setLocation(this.getX(), this.getY() + speed);
        if(this.isAtEdge()) {
            this.setLocation(this.getX(), 0);
        }
    }    
}
