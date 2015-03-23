import greenfoot.*;

/**
 * Write a description of class mainGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainGame extends World
{

    /**
     * Constructor for objects of class mainGame.
     * 
     */
    public mainGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Jalanan(),400,300);
        addObject(new Jalanan(),400,0);
        addObject(new Jalanan(),400,600);
        //addObject(new Jalanan(),400,0);
        //addObject(new Jalanan(),400,200);
        //addObject(new Jalanan(),400,400);
        //addObject(new Jalanan(),400,600);
        Polisi polisi = new Polisi();
        addObject(polisi, 408, 558);
        polisi.setLocation(355, 554);
    }
}
