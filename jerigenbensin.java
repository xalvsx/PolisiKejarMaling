import greenfoot.*;

/**
 * Write a description of class jerigenbensin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jerigenbensin extends TambahKecepatan
{
    /**
     * Act - do whatever the jerigenbensin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public jerigenbensin(int speed) {
        setSpeed(speed);
    }
    
    public void act() 
    {
        // Add your action code here.
        cekNabrak();
    }       
}
