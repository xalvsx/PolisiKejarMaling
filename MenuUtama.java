import greenfoot.*;

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuUtama extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public MenuUtama()
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
        Jalanan jalanan = new Jalanan(0);
        addObject(jalanan, 660, 296);
        Jalanan jalanan2 = new Jalanan(0);
        addObject(jalanan2, 344, 179);
        Jalanan jalanan3 = new Jalanan(0);
        addObject(jalanan3, 448, 528);
        jalanan.setLocation(619, 314);
        jalanan2.setLocation(199, 270);
        jalanan2.setLocation(213, 288);
        jalanan2.getX();
        jalanan2.setLocation(220, 0);
        jalanan3.setLocation(220, 600);
        jalanan.setLocation(220, 300);
        TombolStart tombolstart = new TombolStart();
        addObject(tombolstart, 626, 148);
        TombolHowtoPLay tombolhowtoplay = new TombolHowtoPLay();
        addObject(tombolhowtoplay, 634, 263);
        tombolhowtoplay.setLocation(626, 258);
        TombolCredit tombolcredit = new TombolCredit();
        addObject(tombolcredit, 631, 374);
        tombolcredit.setLocation(627, 366);
        TombolExit tombolexit = new TombolExit();
        addObject(tombolexit, 635, 482);
        tombolexit.setLocation(628, 475);
        tombolstart.setLocation(626, 154);
        tombolexit.setLocation(629, 538);
        tombolexit.setLocation(628, 520);
        tombolcredit.setLocation(628, 414);
        tombolhowtoplay.setLocation(628, 309);
        tombolstart.setLocation(628, 211);
        tombolcredit.setLocation(630, 409);
        tombolstart.getX();
        tombolstart.setLocation(620, 200);
        tombolhowtoplay.setLocation(620, 300);
        tombolcredit.setLocation(620, 400);
        tombolexit.setLocation(620, 500);
    }
}
