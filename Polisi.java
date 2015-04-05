import greenfoot.*;

/**
 * Write a description of class Polisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polisi extends Actor
{
    /**
     * Act - do whatever the Polisi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int character = 0;
    public Polisi(int i) {
        character = i%3;
        
        if(character==1) {
            setImage("motorpol.png");
        }
        else if(character==2) {
            setImage("carpol1.png");
        }
        
        if(i>=3) {
            active = 1;
            menuMode = 1;
        }
    }
    private int menuMode = 0;
    private int active = 0;
    private int counter = 0;
    private int flagbelokkiri = 0;
    private int flagbelokkanan = 0;
    private int langkah = 0;
    private int walking = 0;
    private int lagimaju = 0;
    private int lagimundur = 0;
    
    private void maju() {
        this.setLocation(this.getX(),this.getY()-1);
    }
    
    private void mundur() {
        this.setLocation(this.getX(),this.getY()+1);
    }
    
    public void setActive() {
        active = 1;
    }
    
    private void menuMode() {
        if(walking == 0) {
            int random = Greenfoot.getRandomNumber(100);
            if(random>70) {
                langkah = Greenfoot.getRandomNumber(45)+5;
                if(getY()-langkah<450) {
                    langkah = getY()-450;
                }
                walking = 1;
            }
            else if (random>40) {
                langkah = Greenfoot.getRandomNumber(45)+5;
                
                if(getY()+langkah>550) {
                    langkah = 550-getY();
                }
                walking = 1;
                langkah*=-1;
            }
        }
        else if(walking>1) {
            walking-=2;
        }
        else {
            if(langkah>0) {
                maju();
                langkah--;
            }
            else if(langkah<0) {
                mundur();
                langkah++;
            }
            else {
                walking = 40;
            }
        }
    }
    
    public void act() 
    {
        if(active==1) {
            if(character==0) {
                counter++;
                if(counter==8) {
                    setImage("pol2.png");
                }
                else if(counter==16) {
                    setImage("pol3.png");
                    counter=0;
                }
            }
            
            if(menuMode == 0) {
                if(getX()<260) {
                    setLocation(getX()+2,getY());
                }
                else if(getX()>545) {
                    setLocation(getX()-2,getY());
                }
                if(Greenfoot.isKeyDown("left")) {
                    setLocation(getX()-2,getY());
                    if(flagbelokkiri==0) turn(-20);
                    flagbelokkiri=1;
                }
                else if(Greenfoot.isKeyDown("right")) {
                    setLocation(getX()+2,getY());
                    if(flagbelokkanan==0) turn(20);
                    flagbelokkanan=1;
                }
                else {
                    if(flagbelokkiri==1) {
                        turn(20);
                        flagbelokkiri=0;
                    }
                    else if(flagbelokkanan==1) {
                        turn(-20);
                        flagbelokkanan=0;
                    }
                }
            }
            else if(menuMode == 1) {
                menuMode();
            }
            
            
        }
        
        
        if(lagimaju > 0)
        {
             setLocation(getX(),getY()-1);
             lagimaju--;
        }
        
        if(lagimundur>0)
        {
            if(getY() < 555)
            {
                setLocation(getX(),getY()+1);
            }
            lagimundur--;
        }
    }    
    
    public void tabrak_maju()
    {
      lagimaju = 35;
    }
    
    public void tabrak_mundur()
    {
      lagimundur = 35;
    }
}


