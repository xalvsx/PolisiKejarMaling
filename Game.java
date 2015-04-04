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
<<<<<<< HEAD
    private int counter = 0;
    
=======
    private int speed = 2;
>>>>>>> 015e53f69840dfda1a19320e75caef184848a184
    Jalanan j1,j2,j3;
    private int counter = 0;
    private int awal = 25;
    private int[] range = new int[9];
    private int faktor = 35;
    private int active = 0;
    private Countdown down;
    int ct = 0;
    
    Polisi polisi;
    Maling maling;
    
    public void setActive() {
        j1.setActive();
        j2.setActive();
        j3.setActive();
        polisi.setActive();
        maling.setActive();
        active = 1;
    }
    
    public Game(int i)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
<<<<<<< HEAD
//<<<<<<< HEAD
//=======
        setPaintOrder(Rintangan.class,Polisi.class,Maling.class,Jalanan.class,Countdown.class);
//>>>>>>> 2792d4c9660c9044270d058d07739dbedee3d2d0
=======
        setPaintOrder(Countdown.class,Peluru.class,Rintangan.class,TambahKecepatan.class,Polisi.class,Maling.class,Jalanan.class);
>>>>>>> 015e53f69840dfda1a19320e75caef184848a184
        character = i;
        if (i==1) {
            speed = 4;
        }
        else if (i==2) {
            speed = 6;
        }
        j1 = new Jalanan(character);
        j2 = new Jalanan(character);            
        j3 = new Jalanan(character);
        prepare();
        for(int j=0;j<8;j++) {
            range[j] = awal + (j+1)*faktor;
        }
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
    }
    
    
    
    public void act() {
        if(counter<range[7]+1) {
            counter++;
            if(counter==range[0]) {
                count(1);
            }
            else if(counter==range[1]) {
                removeObject(down);
            }
            else if(counter==range[2]) {
                count(2);
            }
            else if(counter==range[3]) {
                removeObject(down);
            }
            else if(counter==range[4]) {
                count(3);
            }
            else if(counter==range[5]) {
                removeObject(down);
            }
            else if(counter==range[6]) {
                count(4);
                setActive();
            }
            else if(counter==range[7]) {
                removeObject(down);
            }
        }
        
        if(active==1) { //jika timernya sudah GO!! baru jalan
            /* Rintangan
             *   buat logika munculin rintangan secara random disini
             */
            
            ct++;
            if(ct == 150)
            {
                int pil = Greenfoot.getRandomNumber(8);
                int x = 272 + Greenfoot.getRandomNumber(253);
                int y = 100;
                if(pil == 0)
                {
                    addObject(new oli(speed), x, y);
                }
                else if(pil == 1)
                {
                    addObject(new lubang(speed), x, y);
                }
                else if(pil == 2)
                {
                    addObject(new petir(speed), x, y);
                }
                else if(pil ==3)
                {
                    addObject(new botolminum(speed),x,y);
                }
                else if(pil == 4)
                {
                    addObject(new jerigenbensin(speed),x,y);
                }
                ct = 0;
                
            }
            
            if(ct == 75) {
                /* Dekorasi
                 *   buat logika munculin dekorasi disamping jalan secara random disini
                 */
            }
            
        }
    }
    
    public void count(int i)
    {
        down = new Countdown(i);
        addObject(down, 400,300);
    }
    
    public void act()
    {
        counter++;
        if(counter==50)
        {
            counter=0;
            int x = 80 + Greenfoot.getRandomNumber(100);
            int y = 50;
            int random = Greenfoot.getRandomNumber(9);
            switch(random)
            {
                case 0 : break;
                case 1 : break;
                case 2 : break;
                case 3 : break;
                case 4 : break;
                case 5 : break;
                case 6 : break;
                case 7 : break;
                case 8 : break;
                case 9 : break;
            }
            if(random==0)
               ;
               // addObject(maling(), x, y);
        }
    }
}
