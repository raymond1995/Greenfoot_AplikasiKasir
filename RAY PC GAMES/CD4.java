import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CD4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD4 extends Actor
{
    /**
     * Act - do whatever the CD4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
         {
          World w=getWorld();
          ((Template1)w).getIsi().setPrint("Portal 2",30000);
         }    
    }    
}
