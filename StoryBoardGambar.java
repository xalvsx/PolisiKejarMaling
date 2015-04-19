import greenfoot.*;

/**
 * Write a description of class StoryBoardGambar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryBoardGambar extends Actor
{
    /**
     * Act - do whatever the StoryBoardGambar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int counter = 0;
    protected int active = 0;
    protected int posx = 0;
    protected int posy = 0;
    protected int arah = 1;
    protected int awal = 1;
    protected int range = 20;
    public StoryBoardGambar(int x,int y) {
        setDefaultScale();
        posx = x;
        posy = y;
        
    }
    
    public void setDefaultScale() {
        getImage().scale(200,150);
    }
    
    public void act() 
    {
        if(awal==1) {
            setLocation(0,posy);
            if(posx > 400) {
                arah = -1;
                setLocation(800,posy);
            }
            active = 1;
            awal = 0;
        }
        // Add your action code here.
        else if(active == 1) {
            if(getX()>=posx && getX()<=posx+range) {
                active = 0;
                StoryBoard world = (StoryBoard) getWorld();
                world.next();
            }
            counter++;
            if(counter%4==0) {
                setLocation(getX()+arah*range,getY());
            }
        }
        
    }    
    
    public void setUkuran(int width, int height) {
        getImage().scale(width,height);
    }
}
