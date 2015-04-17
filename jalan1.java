import greenfoot.*;

/**
 * Write a description of class jalan1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalan1 extends OrangNyebrang
{
    /**
     * Act - do whatever the jalan1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed= 0;
    
    public jalan1(int speed)
    {
        this.speed=speed;
        //getImage().mirrorHorizontally(); //biar balik
    }
    
    public void cekNabrak() {
        Polisi polisi;
        polisi = (Polisi)getOneObjectAtOffset(0, 0, Polisi.class);
        if(polisi != null)
        {
            polisi.tabrak_mundur();
            
            Game game = (Game) getWorld(); // nglangin
            game.removeObject(this);
        }
        else cekPosisi();
        
    }
    
    public void cekPosisi() 
    {
        setLocation(getX()+speed,getY()+speed);
        
        if(isAtEdge()) {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
    
     
    
    public void act()
    {
        cekNabrak();
    }
}
