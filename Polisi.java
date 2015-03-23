import greenfoot.*;

/**
 * Write a description of class Polisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polisi extends Actor
{
    /**
     * Act - do whatever the Polisi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    private int flagbelokkiri = 0;
    private int flagbelokkanan = 0;
    public void act() 
    {
        counter++;
        if(counter==8) {
            setImage("pol2.png");
        }
        else if(counter==16) {
            setImage("pol3.png");
            counter=0;
        }
        
        if(getX()<250) {
            setLocation(getX()+2,getY());
        }
        else if(getX()>550) {
            setLocation(getX()-2,getY());
        }
        
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX()-2,getY());
            if(flagbelokkiri==0) turn(-20);
            flagbelokkiri=1;
        }
        else if(Greenfoot.isKeyDown("right")) {
            setLocation(getX()+2,getY());
            if(flagbelokkanan==0) turn(20);
            flagbelokkanan=1;
        }
        else {
            if(flagbelokkiri==1) {
                turn(20);
                flagbelokkiri=0;
            }
            else if(flagbelokkanan==1) {
                turn(-20);
                flagbelokkanan=0;
            }
        }
    
    }    
}
