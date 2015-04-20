import greenfoot.*;

/**
 * Write a description of class OrangNyebrang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangNyebrang extends Actor
{
    /**
     * Act - do whatever the OrangNyebrang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    protected int speed = 2;
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void cekPosisi() {
        setLocation(getX(),getY() + speed);
        
        if(getY() > 570) {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
}
