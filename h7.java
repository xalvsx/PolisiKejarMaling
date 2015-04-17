import greenfoot.*;

/**
 * Write a description of class h7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h7 extends home
{
    /**
     * Act - do whatever the h7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h7(int speed) {
        setSpeed(speed);
    
        this.setImageSize();
    }
    
    
    public void act() 
    {
        moveHome();
    }    
}
