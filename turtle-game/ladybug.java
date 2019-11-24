import greenfoot.*;
import java.awt.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ladybug extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
     {
        if(isAtEdge())
        {
          turn(8);  
        }
        if(Greenfoot.getRandomNumber(40)<4)
        {
          turn(Greenfoot.getRandomNumber(90)-45);  
        }
        if(isTouching(lettuce.class))
       {
           removeTouching(lettuce.class);
        }
        move(1);
        
    }
}
