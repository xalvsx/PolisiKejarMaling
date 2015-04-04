import greenfoot.*;

/**
 * Write a description of class petir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class petir extends TambahKecepatan
{
    /**
     * Act - do whatever the petir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     public petir(int speed) {
        setSpeed(speed);
    }
    
    public void act() 
    {
        // Add your action code here.
        cekNabrak();
    }    
     
}
