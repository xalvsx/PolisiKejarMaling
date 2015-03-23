import greenfoot.*;

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
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
        Jalanan jalanan = new Jalanan();
        addObject(jalanan, 660, 296);
        Jalanan jalanan2 = new Jalanan();
        addObject(jalanan2, 344, 179);
        Jalanan jalanan3 = new Jalanan();
        addObject(jalanan3, 448, 528);
        jalanan.setLocation(619, 314);
        jalanan2.setLocation(199, 270);
        jalanan2.setLocation(213, 288);
        jalanan2.getX();
        jalanan2.setLocation(220, 0);
        jalanan3.setLocation(220, 600);
        jalanan.setLocation(220, 300);
    }
}
