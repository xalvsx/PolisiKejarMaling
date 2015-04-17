import greenfoot.*;

/**
 * Write a description of class h1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h1 extends home
{
    /**
     * Act - do whatever the h1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h1(int speed) {
        setSpeed(speed);
        this.setImageSize();
    }
    
    public void act() 
    {
        moveHome();
    }    
}
