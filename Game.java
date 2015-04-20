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
    private int counter = 0;
    private int speed = 2;
    Jalanan j1,j2,j3;
    private int awal = 25;
    private int[] range = new int[9];
    private int faktor = 35;
    private int active = 0;
    private Countdown down;
    int ct = 0;
    
    Polisi polisi;
    Maling maling;
    Timer timer;
    TotalPeluru totalpeluru;
    
    public void addPeluru(int i) {
        totalpeluru.addPeluru(i);
    }
    
    public void setActive() {
        j1.setActive();
        j2.setActive();
        j3.setActive();
        polisi.setActive();
        maling.setActive();
        active = 1;
        timer.setActive();
    }
    
    public Game(int i)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
//<<<<<<< HEAD
//<<<<<<< HEAD/
//=======
        setPaintOrder(Rintangan.class,Polisi.class,Maling.class,Jalanan.class,Countdown.class);
//>>>>>>> 2792d4c9660c9044270d058d07739dbedee3d2d0
        setPaintOrder(Countdown.class,Peluru.class,Rintangan.class,TambahKecepatan.class,Polisi.class,Maling.class,Jalanan.class);
//=======
        
        setPaintOrder(Countdown.class,Peluru.class,OrangNyebrang.class,Rintangan.class,TambahKecepatan.class,Pistol.class,Polisi.class,Maling.class,Jalanan.class);

//>>>>>>> 7a289799bf88c14780cc873b4f652ade5d6e2a9d
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
//<<<<<<< HEAD
        
        
//=======
        Tulisan tulisan = new Tulisan(0);
        addObject(tulisan, 688, 73);
        tulisan.setLocation(744, 60);
        Tulisan tulisan2 = new Tulisan(1);
        addObject(tulisan2, 104, 42);
        tulisan2.setLocation(157, 60);
        timer = new Timer();
        addObject(timer, 144, 118);
        timer.setLocation(179, 91);
        totalpeluru = new TotalPeluru();
        addObject(totalpeluru, 698, 80);
        totalpeluru.setLocation(791, 94);
        totalpeluru.setLocation(793, 90);
    }
    
    public void newPeluru(int x, int y) {
        addObject(new Peluru(speed),x,y);

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
                int pil = Greenfoot.getRandomNumber(10);
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
                else if(pil == 5)
                {
                    addObject(new Pistol(speed),x,y);
                }
                else if(pil == 6)
                {
                    addObject(new jalan1(speed),212,96);
                }
                /*
                else if(pil == 5)
                {
                    addObject(new jalan1(speed),
                }
                */
               
                
                ct = 0;
                
            }
            
            if(ct == 75) {
                /* Dekorasi
                 *   buat logika munculin dekorasi disamping jalan secara random disini
                 */
           
                int pilih = Greenfoot.getRandomNumber(9);
                int x_kanan = 697 + Greenfoot.getRandomNumber(19);
                int y_kiri = 107;
                if(pilih == 0)
                {
                    addObject(new h1(speed), x_kanan, y_kiri);
    
                }
                else if(pilih == 1)
                {
                    addObject(new h3(speed), x_kanan, y_kiri);
                
                }
                else if(pilih == 2)
                {
                    addObject(new h4(speed), x_kanan, y_kiri);
                
                }
                else if(pilih ==3)
                {
                    addObject(new h5(speed), x_kanan, y_kiri);
                
                }
                else if(pilih == 4)
                {
                    addObject(new h8(speed), x_kanan, y_kiri);
                
                }
                ct = 0;
                
            }
                
            if(ct == 35) {
                /* Dekorasi
                 *   buat logika munculin dekorasi disamping jalan secara random disini
                 */
           
                int pilih = Greenfoot.getRandomNumber(9);
                int x_kanan = 89 + Greenfoot.getRandomNumber(20);
                int y_kiri = 107;
                if(pilih == 0)
                {
                    addObject(new h1(speed), x_kanan, y_kiri);
    
                }
                else if(pilih == 1)
                {
                    addObject(new h2(speed), x_kanan, y_kiri);
                
                }
                else if(pilih == 2)
                {
                    addObject(new h6(speed), x_kanan, y_kiri);
                
                }
                else if(pilih ==3)
                {
                    addObject(new h7(speed), x_kanan, y_kiri);
                
                }
                else if(pilih == 4)
                {
                    addObject(new h9(speed), x_kanan, y_kiri);
                
                }
                ct = 0;
                
            }
            
        }
    }
    
    public void count(int i)
    {
        down = new Countdown(i);
        addObject(down, 400,300);
    }
    
}
