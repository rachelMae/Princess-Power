import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cont here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cont extends chat
{
     private GreenfootImage congrats = new GreenfootImage("congratsS.png");
    
    /**
     * Act - do whatever the cont wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(450,250); 
            setImage(congrats);
       
    }   
}
