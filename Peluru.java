import greenfoot.*;

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int speed = 2;
   
    public void SetSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void cekNabrak()
    {
        Maling maling;
        maling = (Maling)getOneObjectAtOffset(0, 0, Maling.class);
        if(maling != null)
        {
            maling.tabrak_mundur();
            
            Game game = (Game) getWorld(); // nglangin
            game.removeObject(this);
        }
        else cekPosisi();
    }
    
     public void cekPosisi()
    {
        setLocation(getX(), getY() - speed);
        
        if(isAtEdge())
        {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
    
    public Peluru(int speed)
    {
        SetSpeed(speed);
    }
    
    public void act() 
    {
        // Add your action code here.
       /* 
       if(Greenfoot.isKeyDown("space"))
       {
           peluru();
       }
       maunya pas pencet spasi itu baru bisa nembak (?)
       */ 
      cekNabrak();
    } 
}
