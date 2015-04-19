import greenfoot.*;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends TextClass
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    private int time = 90;
    private int counter = 0;
    private int active = 0;
    
    public void setActive() {
        active = 1;
    }
    
    public Timer() {
        image = new GreenfootImage(200, 100); 
        String tulisan = "90";
        image.setColor(java.awt.Color.black); 
        image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,30));
        
        image.drawString(tulisan, 0,30);
        
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(active == 1) {
            counter++;
            if(counter>100) {
                image.clear();
                time--;
                String tulisan = time + "";
                image.drawString(tulisan, 0,30);
                
                setImage(image);
                counter = 0;
                if(time==0) {
                    Greenfoot.setWorld(new YouLose());
                }
            }
        }
    }    
}
