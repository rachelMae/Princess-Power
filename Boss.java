import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends SmoothMover
{
    /**
     * Act - do whatever the Skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health = 100;
    private int timer =0;
    private int count = 0;
    static public boolean done= false;
    //static public boolean finally = false;
    public void act() 
    {
        
        count = Greenfoot.getRandomNumber(200);
        if(count % 150 == 0){
         if (getObjectsInRange(900, Fire.class).size() < 3){
         World world = getWorld();
         world.addObject(new Fire(),getX(),getY());
        }
        }
        checkIfHit(); 
        if( health == 0 )
        {
         getWorld().removeObject(this);
         done=true;
        }
    }    
     public void checkIfHit()
    {
         Crown a = (Crown) getOneIntersectingObject(Crown.class);
        if (a != null) 
        {
            //getWorld().removeObject(Arrow.class);
            // Greenfoot.stop();
            health= health-5;

        }
    }
}
