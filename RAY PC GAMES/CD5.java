import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CD5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD5 extends Actor
{
    /**
     * Act - do whatever the CD5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
         {
            World w=getWorld();
            ((Template1)w).getIsi().setPrint("Sleeping Dogs",30000);
         }    
    }    
}
