import greenfoot.*;

/**
 * Write a description of class GambarPanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GambarPanah extends Actor
{
    /**
     * Act - do whatever the GambarPanah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    private int active = 0;
    private int awal = 1;
    protected int posx = 0;
    protected int posy = 0;
    protected int arah = 1;
    private int range = 20;
    public GambarPanah(int rotation,int x,int y) {
        setRotation(rotation);
        getImage().scale(100,50);
        posx = x;
        posy = y;
        active = 1;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(awal == 1) {
             setLocation(posx,0);
            if(posy > 300) {
                arah = -1;
                setLocation(posx,600);
            }
            active = 1;
            awal = 0;
        }
        else if(active == 1) {
            if(getY()>=posy && getY()<=posy+range) {
                active = 0;
                StoryBoard world = (StoryBoard) getWorld();
                world.next();
            }
            counter++;
            if(counter%4==0) {
                setLocation(getX(),getY()+arah*range);
            }
        }
    }    
}
