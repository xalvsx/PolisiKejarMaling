import greenfoot.*;

/**
 * Write a description of class Maling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maling extends Actor
{
    /**
     * Act - do whatever the Maling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    private int counter2 = 0;
    private int arah = 50;
    private int flagbelokkiri = 0;
    private int flagbelokkanan = 0;
    
    public void act() 
    {
        counter++;
        counter2++;
        if(counter==8) {
            setImage("mal2.png");
        }
        else if(counter==16) {
            setImage("mal3.png");
            counter=0;
        }
        
        if(getX()<260) {
            setLocation(getX()+2,getY());
        }
        else if(getX()>540) {
            setLocation(getX()-2,getY());
        }
        
        if(counter2>28) { arah = Greenfoot.getRandomNumber(100) + 1; counter2 = 0;}
        
        if(arah < 30) {
            setLocation(getX()-2,getY());
            if(flagbelokkiri==0) turn(-20);
            flagbelokkiri=1;
        }
        else if(arah > 70) {
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
