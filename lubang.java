import greenfoot.*;

/**
 * Write a description of class lubang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lubang extends Rintangan
{
    /**
     * Act - do whatever the lubang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lubang(int speed) {
        setSpeed(speed);
    }
    
    public void act() 
    {
        // Add your action code here.
        cekNabrak();
    }    
}
