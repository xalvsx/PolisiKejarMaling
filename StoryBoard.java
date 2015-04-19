import greenfoot.*;

/**
 * Write a description of class StoryBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryBoard extends World
{

    /**
     * Constructor for objects of class StoryBoard.
     * 
     */
    private int counter = 0;
    private int counter2 = 0;
    private int active = 0;
    StoryBoard gambar;
    public StoryBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        getBackground().scale(800,600);
        setPaintOrder(GambarPanah.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        TombolPlay tombolplay = new TombolPlay();
        addObject(tombolplay, 671, 539);
        tombolplay.setLocation(660, 522);
        next();
    }
    
    public void next() {
        if(counter%2==1) {
            switch (counter) {
                case 1 : 
                    addObject(new Gambar1(131,104),131,104);
                break;
                case 3 : 
                    addObject(new GambarPanah(0,269,110),269,110);
                break;
                case 5 : 
                    addObject(new Gambar2(415,92),415,92);
                break;
                case 7 : 
                    addObject(new GambarPanah(30,563,119),563,119);
                break;
                case 9 : 
                    addObject(new Gambar3(688,164),688,164);
                break;
                case 11 : 
                    addObject(new GambarPanah(90,691,254),691,254);
                break;
                case 13 : 
                    addObject(new Gambar4(677,384),677,384);
                break;
                case 15 : 
                    addObject(new GambarPanah(195,552,331),552,331);
                break;
                case 17 : 
                    addObject(new Gambar5(406,309),406,309);
                break;
                case 19 : 
                    addObject(new GambarPanah(170,269,321),269,321);
                break;
                case 21 : 
                    addObject(new Gambar6(123,332),123,332);
                break;
                case 23 : 
                    addObject(new GambarPanah(45,233,430),233,430);
                break;
                case 25 : 
                    addObject(new Gambar7(340,506),340,506);
                break;
                case 27 : 
                    addObject(new GambarPanah(-5,495,520),495,520);
                break;
                default : break;
            }
            counter++;
        }
        else {
            active = 1;
        }
    }
    
    public void act() {
        if(active == 1) {
            counter2++;
            if(counter2 == 40) {
                counter2 = 0;
                active = 0;
                counter++;
                next();
            }
        }
    }
}
