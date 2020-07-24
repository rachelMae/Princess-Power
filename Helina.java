import greenfoot.*;
import java.util.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helina here.
 * 
 * @author (your name) rachel dauns
 * @version (a version number or a date) july 30
 */
public class Helina extends SmoothMover
{
    //private int health = 60;
    private GreenfootImage one = new GreenfootImage("princess.png");
    private GreenfootImage two = new GreenfootImage("princess2.png");
    private GreenfootImage three = new GreenfootImage("princess3.png");
    private GreenfootImage rOne = new GreenfootImage("rightPrincess.png");
    private GreenfootImage rTwo = new GreenfootImage("rightPrincess2.png");
    private GreenfootImage rThree = new GreenfootImage("rightPrincess3.png");
    private GreenfootImage four = new GreenfootImage("princess4.png");
    //private GreenfootImage five = new GreenfootImage("BlueJay (4).png");
    //private GreenfootImage six = new GreenfootImage("BlueJay (5).png");
    //private GreenfootImage seven = new GreenfootImage("BlueJay (6).png");
    //private GreenfootImage eight = new GreenfootImage("BlueJay (7).png");
    int x=0;
    public int health = 60;
    public int score = health;
    private int ySpeed;
    private int reload =0;
    private int a =0, c=0;
    private int b=0, d=0;
    private int groundLevel = 300;
    private int l=0;
    private int te=0;
    
    
  
    /**
     * Act - do whatever the Helina wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
         
        checkKey();
     
        checkCollision();
        
        // move(1);
        reload++;
        changeToBoss();
        
        if(health == 0)
        {
            getWorld().removeObject(this);
         
        }
        
    } 

    public void checkKey()
    {

        boolean onGround =(getY()== groundLevel);
        if(! onGround)
        {
            ySpeed++;
            setLocation(getX(), getY()+ySpeed);
            if(getY()>=groundLevel)
            {
                setLocation(getX(), groundLevel);
                Greenfoot.getKey();
            }
        }
        else
        {
            if(Greenfoot.isKeyDown("up"))
            {
                ySpeed = -15;
                setLocation(getX(), getY()+ySpeed);
            }
        }
        if(Greenfoot.isKeyDown("left"))
         {
           setLocation(getX() -5, getY());
           motionleft();
         }
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+5,getY());
           motionright();
        }
        if(Greenfoot.isKeyDown("space")){
            fire();
        }
    }
    public void motionleft()
    {
         if(x==0){
             setImage(one);
            }
         if(x==1){
             setImage(two);
            }
         if(x==2){
             setImage(three);
            }
         x++;
         x=x%15;
   }
   public void motionright()
   {
         if(x==0){
             setImage(rOne);
            }
         if(x==1){
             setImage(rTwo);
            }
         if(x==2){
             setImage(rThree);
            }
         x++;
         x=x%15;
   }
    
     
    public void checkCollision() 
    {
        
       
        Arrow a = (Arrow) getOneIntersectingObject(Arrow.class);
        if (a != null) 
        {
            
             //Greenfoot.stop();
              health = health-1;
              score=health;
        }
        
    }
    

    
    public void fire() 
    {
        if( reload > 25)
        {

            getWorld().addObject (new Crown(getVelocity(), getRotation()), getX(), getY());
            reload = 0;
        }
    }

    public void changeToBoss()
    {
        if(isAtEdge( ) && getObjectsInRange(900, Skeleton.class).size() == 0){
            a=1;
        }
        if(a==1){
            getWorld().setBackground(new GreenfootImage("BossRoompt2.png"));
            c++;

        }
        if(c==1){
            groundLevel = 330;
            setLocation(5,groundLevel);
            Boss boss = new Boss();
            getWorld().addObject(boss, 475,250);
            c=2;

        }
         
    }
      

}