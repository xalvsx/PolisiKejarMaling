import greenfoot.*;

/**
 * Write a description of class h8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h8 extends home
{
    /**
     * Act - do whatever the h8 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h8(int speed) {
        setSpeed(speed);
        this.setImageSize();
    }
    
    
    public void act() 
    {
        moveHome();
    }    
}
