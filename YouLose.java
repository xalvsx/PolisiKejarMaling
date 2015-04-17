import greenfoot.*;

/**
 * Write a description of class YouLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouLose extends World
{

    /**
     * Constructor for objects of class YouLose.
     * 
     */
    public YouLose()
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
        TombolBackToMainMenu tombolbacktomainmenu = new TombolBackToMainMenu();
        addObject(tombolbacktomainmenu, 669, 567);
        tombolbacktomainmenu.setLocation(669, 561);
    }
}
