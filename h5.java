import greenfoot.*;

/**
 * Write a description of class h5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h5 extends home
{
    /**
     * Act - do whatever the h5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public h5(int speed) {
        setSpeed(speed);
        
        this.setImageSize();
    }
    
    
    public void act() 
    {
        moveHome();
    }    
}
