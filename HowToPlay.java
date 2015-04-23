import greenfoot.*;

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        this.getBackground().scale(800,600);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        TombolBackToMainMenu tombolbacktomainmenu = new TombolBackToMainMenu();
        addObject(tombolbacktomainmenu, 407, 558);
        tombolbacktomainmenu.setLocation(406, 554);
    }
}
