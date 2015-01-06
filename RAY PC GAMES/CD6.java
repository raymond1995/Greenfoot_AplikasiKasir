import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CD6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD6 extends Actor
{
    /**
     * Act - do whatever the CD6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
         {
            World w=getWorld();
            ((Template1)w).getIsi().setPrint("Sherlock Holmes",40000);
         }    
    }    
}
