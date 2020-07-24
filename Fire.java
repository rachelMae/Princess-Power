import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends SmoothMover
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Fire()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
        turnTowards(5, 300);
        Princess a = (Princess) getOneIntersectingObject(Princess.class);
        move(5);
    
        if( getX() < 10 || a != null )
        {
         
          getWorld().removeObject(this);
        }
        
    }    
}
