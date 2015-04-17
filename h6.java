import greenfoot.*;

/**
 * Write a description of class h6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h6 extends home
{
    /**
     * Act - do whatever the h6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h6(int speed) {
        setSpeed(speed);
        this.setImageSize();
    }
    
    
    public void act() 
    {
        moveHome();
    }    
}
