import greenfoot.*;

/**
 * Write a description of class TambahKecepatan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TambahKecepatan extends Actor
{
    /**
     * Act - do whatever the TambahKecepatan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    protected int speed = 2;
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void cekNabrak() {
        Actor polisi;
        polisi = getOneObjectAtOffset(0, 0, Polisi.class);
        if(polisi != null)
        {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
        else cekPosisi();
    }
    
    public void cekPosisi() {
        setLocation(getX(),getY() + speed);
        
        if(getY() > 570) {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
