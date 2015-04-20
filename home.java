import greenfoot.*;

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends Actor
{
    /**
     * Act - do whatever the home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int speed = 2;
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setImageSize(){
        GreenfootImage img = getImage();
        img.scale(196,200);
        this.setImage(img);
    }
    public void cekNabrak() {
        Actor polisi;
        polisi = getOneObjectAtOffset(0, 0, Polisi.class);
        if(polisi != null)
        {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
        else cekPosisi();
    }
    
    public void cekPosisi() {
        setLocation(getX(),getY() + speed);
        
        if(getY() > 1200) {
            Game game = (Game) getWorld();
            game.removeObject(this);
        }
    }
    
    public void moveHome(){
        this.setLocation(getX(),getY()+this.speed);
        if(this.getY() > 1200){
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
