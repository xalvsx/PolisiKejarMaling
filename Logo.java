import greenfoot.*;

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    
    public void act() 
    {
        if(counter<25) {
            if(counter%5==0) setLocation(getX(),getY()+1); //4x +
        }
        else if(counter<50) {
            if(counter%10==0) setLocation(getX(),getY()+1); //2x +
        }
        else if(counter<100 && counter >=75) {
            if(counter%10==0) setLocation(getX(),getY()-1); //2x -
        }
        else if(counter<150 && counter >=100) {
            if(counter%5==0) setLocation(getX(),getY()-1); //9x -
        }
        else if(counter<175 && counter >=150) {
            if(counter%10==0) setLocation(getX(),getY()-1); //3x -
        }
        else if(counter<225 && counter >=200) {
            if(counter%10==0) setLocation(getX(),getY()+1); //3x +
        }
        else if(counter<=250 && counter >=225) {
            if(counter%5==0) setLocation(getX(),getY()+1); // 4x +
        }
        else if(counter>250) counter = 0;
        
        counter++;
    }    
}
