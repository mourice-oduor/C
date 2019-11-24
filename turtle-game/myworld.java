import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myworld extends World
{

  
    public myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    
   

    public void prepare()
   {
        lettuce mylettuce=new lettuce();
        addObject(mylettuce, 50, 290);
        lettuce mylettuce1=new lettuce();
        addObject(mylettuce1, 350, 250);
         lettuce mylettuce2=new lettuce();
        addObject(mylettuce2, 300, 170);
         lettuce mylettuce3=new lettuce();
        addObject(mylettuce3, 220, 110);
         lettuce mylettuce4=new lettuce();
        addObject(mylettuce4, 100, 200);
         lettuce mylettuce5=new lettuce();
        addObject(mylettuce5, 400, 320);
         lettuce mylettuce6=new lettuce();
        addObject(mylettuce6, 160, 280);
         lettuce mylettuce7=new lettuce();
        addObject(mylettuce7, 450, 160);
         lettuce mylettuce8=new lettuce();
        addObject(mylettuce8, 280, 50);
    }
}