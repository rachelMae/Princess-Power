import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    private GreenfootImage one = new GreenfootImage ("maxhealth.png");
    private GreenfootImage two = new GreenfootImage ("2health.png");
    private GreenfootImage three = new GreenfootImage("1health.png");
    private GreenfootImage four = new GreenfootImage("nohealth.png");
    
    public int health = 60;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
                //super(health);

        
    }
    public void act() 
    {
        checkHealth();
        
    } 
    
    public void checkHealth()
    {

        if(health > 40)
        {
            setImage(one);
            
        }
        else if(health > 20)
        {
            setImage(two);
            
        }
        else if (health>0)
        {
            setImage(three);
        }
        else
        {
            setImage(four);
            
        }
    }
}
