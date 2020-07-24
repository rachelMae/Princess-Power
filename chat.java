 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Write a description of class chat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chat extends wizard
{
    /**
     * Act - do whatever the chat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean place;
    int x=0;
     
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        
        int i=1;
        String ans1;
        String ans2;
        String ans3;
        boolean win = true;
    private GreenfootImage hello = new GreenfootImage("hello1.png");
    private GreenfootImage moveOn = new GreenfootImage("moveOn.png");
    
     public void act(){ 
         x++;
         if(x<=250){
         setImage(hello);
         x++;
        }
         if(x>300){
           setImage(moveOn);
            
            
    }
}
 } 

