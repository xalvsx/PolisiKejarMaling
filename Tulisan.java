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
    private int i = 0;
    public Tulisan(int i) {
        if(i>1) {
            image = new GreenfootImage(400, 100);
        }
        else {
            image = new GreenfootImage(200, 100); 
        }
        
        String tulisan = "";
        if(i==0) {
            tulisan = "Peluru :";
        }
        else if(i==1) {
            tulisan = "Time";
        }
        image.setColor(java.awt.Color.black); 
        if(i==7) {
            image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,24));
            image.setColor(java.awt.Color.white); 
        }
        else if(i>1) {
            image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,20));
            image.setColor(java.awt.Color.white); 
        }
        else {
            image.setFont(new java.awt.Font("Verdana",java.awt.Font.PLAIN,30));
        }
        
        if(i==2) {
            tulisan = "Shofura Adzani - 12110110033";
        }
        else if(i==3) {
            tulisan = "Lucy Meiliana - 12110110034";
        }
        else if(i==4) {
            tulisan = "Julia - 12110110036";
        }
        else if(i==5) {
            tulisan = "Jessika Wandapranata - 12110110037";
        }
        else if(i==6) {
            tulisan = "Alfian Setyowijoyo - 12110110063";
        }
        else if(i==7) {
            tulisan = "Created By :";
        }
        
        image.drawString(tulisan, 0,30);
        this.i = i;
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(i>1) {
            if(getY() > 154) {
                setLocation(getX(),getY()-1);
            }
            else {
                setLocation(getX(),512);
            }
        }
    }    
}
