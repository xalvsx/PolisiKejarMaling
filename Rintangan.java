import greenfoot.*;

/**
 * Write a description of class Rintangan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rintangan extends Actor
{
    /**
     * Act - do whatever the Rintangan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void cekPosisi() {
        if(getY() > 570) {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
    
    public void turun() {
        setLocation(getX(),getY() + 2);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
