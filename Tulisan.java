import greenfoot.*;

/**
 * Write a description of class Tulisan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tulisan extends TextClass
{
    /**
     * Act - do whatever the Tulisan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    
    public Tulisan(int i) {
        image = new GreenfootImage(200, 100); 
        String tulisan = "";
        if(i==0) {
            tulisan = "Peluru :";
        }
        else if(i==1) {
            tulisan = "Time";
        }
        image.setColor(java.awt.Color.black); 
        image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,30));
        image.drawString(tulisan, 0,30);
        
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
