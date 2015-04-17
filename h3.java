import greenfoot.*;

/**
 * Write a description of class h3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h3 extends home
{
    /**
     * Act - do whatever the h3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h3(int speed) {
        setSpeed(speed);
        this.setImageSize();
    }
    
    public void act() 
    {
        moveHome();
    }    
}
