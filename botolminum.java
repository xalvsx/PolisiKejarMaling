import greenfoot.*;

/**
 * Write a description of class botolminum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botolminum extends TambahKecepatan
{
    /**
     * Act - do whatever the botolminum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public botolminum(int speed) {
        setSpeed(speed);
    }
    
    public void act() 
    {
        // Add your action code here.
        cekNabrak();
    }   
}
