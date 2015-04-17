import greenfoot.*;

/**
 * Write a description of class TotalPeluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TotalPeluru extends TextClass
{
    /**
     * Act - do whatever the TotalPeluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    private int peluru = 0;
    
    public void addPeluru(int i) {
        peluru += i;
        image.clear();
        String tulisan = peluru + "";
        image.drawString(tulisan, 0,30);
                
        setImage(image);
    }
    
    public TotalPeluru() {
        image = new GreenfootImage(200, 100); 
        String tulisan = "0";
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
