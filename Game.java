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
    
    Jalanan j1,j2,j3;
    
    Polisi polisi;
    Maling maling;
    
    public void setActive() {
        j1.setActive();
        j2.setActive();
        j3.setActive();
        polisi.setActive();
        maling.setActive();
    }
    
    public Game(int i)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setPaintOrder(Rintangan.class,Polisi.class,Maling.class,Jalanan.class,Countdown.class);
        character = i;
        j1 = new Jalanan(character);
        j2 = new Jalanan(character);
        j3 = new Jalanan(character);
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
        addObject(j1,400,300);
        addObject(j2,400,0);
        addObject(j3,400,600);
        polisi = new Polisi(character);
        addObject(polisi, 408, 558);
        polisi.setLocation(355, 554);
        maling = new Maling(character);
        addObject(maling, 355, 113);
        maling.setLocation(398, 58);
        polisi.setLocation(401, 555);
        count();
    }
    
    public void count()
    {
        Countdown down = new Countdown();
        addObject(down, 400,300);
    }
}
