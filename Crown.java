import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crown extends SmoothMover
{
    public Crown(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        addToVelocity(new Vector(rotation, 15));
        
    }
    
    /**
     * The bullet will damage cat if it hits it.
     */
    public void act()
    {
        Skeleton a = (Skeleton) getOneIntersectingObject(Skeleton.class);
        Boss b = (Boss) getOneIntersectingObject(Boss.class);
        move(5);
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
        if (b != null) 
        {
            //getWorld().removeObject(Arrow.class);
            // Greenfoot.stop();
            getWorld().removeObject(this);
        }
        // if(isTouching(Skeleton.class)){
            // getWorld().removeObject(this);
        // }
        
    }    
}
