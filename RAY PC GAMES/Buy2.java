import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy2 extends Actor
{
    /**
     * Act - do whatever the Buy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)){
            World w=getWorld();
            ((Template1)w).getIsi().simpan();
        }
    }    
}
