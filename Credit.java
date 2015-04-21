import greenfoot.*;

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        getBackground().scale(800,600);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Tulisan tulisan = new Tulisan(7);
        addObject(tulisan, 407, 267);
        tulisan.setLocation(524, 205);
        Tulisan tulisan2 = new Tulisan(2);
        addObject(tulisan2, 399, 271);
        Tulisan tulisan3 = new Tulisan(3);
        addObject(tulisan3, 413, 301);
        Tulisan tulisan4 = new Tulisan(4);
        addObject(tulisan4, 430, 320);
        Tulisan tulisan5 = new Tulisan(5);
        addObject(tulisan5, 432, 320);
        Tulisan tulisan6 = new Tulisan(6);
        addObject(tulisan6, 523, 357);
        tulisan2.setLocation(419, 238);
        tulisan5.setLocation(441, 286);
        tulisan5.setLocation(427, 337);
        tulisan6.setLocation(423, 507);
        tulisan6.setLocation(399, 507);
        tulisan6.setLocation(425, 503);
        tulisan5.setLocation(411, 478);
        tulisan4.setLocation(509, 453);
        tulisan3.setLocation(462, 427);
        tulisan2.setLocation(455, 402);
        tulisan.setLocation(543, 358);
        TombolBackToMainMenu tombolbacktomainmenu = new TombolBackToMainMenu();
        addObject(tombolbacktomainmenu, 690, 556);
        tombolbacktomainmenu.setLocation(680, 558);
    }
}
