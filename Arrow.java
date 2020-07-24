import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends SmoothMover
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Arrow()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
        Princess a = (Princess) getOneIntersectingObject(Princess.class);
        move(-5);
    
        if( isAtEdge())
        {
         
          getWorld().removeObject(this);
        }
         
        if (a != null) 
        {
            //getWorld().removeObject(Arrow.class);
            // Greenfoot.stop();
            getWorld().removeObject(this);
        }
    }    
}
