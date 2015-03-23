import greenfoot.*;

/**
 * Write a description of class mainGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class mainGame.
     * 
     */
    private int character = 0;
    
    public Game(int i)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        character = i;
        prepare();
    }
    

    public int getCharacterMode() {
        return this.character;
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Jalanan(character),400,300);
        addObject(new Jalanan(character),400,0);
        addObject(new Jalanan(character),400,600);
        Polisi polisi = new Polisi(character);
        addObject(polisi, 408, 558);
        polisi.setLocation(355, 554);
        Maling maling = new Maling(character);
        addObject(maling, 355, 113);
        maling.setLocation(398, 58);
        polisi.setLocation(401, 555);
    }
}
