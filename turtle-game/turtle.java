import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    private int lettucesEaten;
    private int bugsEaten;
    public void act() 
     {
        if(isAtEdge())
        {
          turn(2);  
        }
        if(Greenfoot.isKeyDown("right"))
        {
          turn(4);  
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        move(4);
        if(isTouching(ladybug.class))
        {
            removeTouching(ladybug.class);
             bugsEaten=bugsEaten +5;
             getWorld().showText("ladybugScore:"+bugsEaten,160,80);
             
          
         }
 
         
         if(isTouching(lettuce.class))
         {
             removeTouching(lettuce.class);
             lettucesEaten=lettucesEaten +1;
             getWorld().showText("lettuceScore:"+lettucesEaten,100,50);
             
             
          }
            
        
    }
    
    
    
    
}


