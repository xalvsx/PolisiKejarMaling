import greenfoot.*;

/**
 * Write a description of class SelectPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectPlayer extends World
{

    /**
     * Constructor for objects of class SelectPlayer.
     * 
     */
    public SelectPlayer()
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
        addObject(tombolbacktomainmenu, 673, 565);
        tombolbacktomainmenu.setLocation(670, 560);
        TombolKarakter3 tombolkarakter3 = new TombolKarakter3();
        addObject(tombolkarakter3, 169, 291);
        TombolKarakter1 tombolkarakter1 = new TombolKarakter1();
        addObject(tombolkarakter1, 651, 296);
        TombolKarakter2 tombolkarakter2 = new TombolKarakter2();
        addObject(tombolkarakter2, 419, 298);
        tombolkarakter2.setLocation(416, 292);
        tombolkarakter1.setLocation(649, 291);
    }
}
