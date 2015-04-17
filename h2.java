import greenfoot.*;

/**
 * Write a description of class h2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h2 extends home
{
    /**
     * Act - do whatever the h2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h2(int speed) {
        setSpeed(speed);
        this.setImageSize();
    }
    
    public void act() 
    {
        moveHome();
    }    
}
