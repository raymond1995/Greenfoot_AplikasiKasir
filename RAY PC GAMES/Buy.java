import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy extends Actor
{
    /**
     * Act - do whatever the buy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)){
            World w=getWorld();
            ((Template1)w).getIsi().simpan();
       }    
    }
}
