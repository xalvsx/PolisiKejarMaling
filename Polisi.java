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
    }    
}