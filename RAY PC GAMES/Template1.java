import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Template1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Template1 extends World
{
    public isi isi;
    public Buy buy;
    public isi total;
    Logo logo = new Logo();
    Print1 print1 = new Print1();
    Print2 print2 = new Print2();
    CD1 cd1 = new CD1();
    CD2 cd2 = new CD2();
    CD3 cd3 = new CD3();
    CD4 cd4 = new CD4();
    CD5 cd5 = new CD5();
    CD6 cd6 = new CD6();
    Reset reset = new Reset();
    Cash cash = new Cash();
    
    /**
     * Constructor for objects of class Template1.
     * 
     */
    public Template1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
     public Print1 getPrint1(){
        return print1;
    }
    
    private void prepare()
    {
        addObject(cash, 377, 220);
        addObject(logo, 575, 83);
        addObject(reset, 89, 213);
        buy = new Buy();
        addObject(buy, 233, 212);
        addObject(print1, 157,78);
        addObject(print2, 624, 389);
        addObject(cd1, 83, 336);
        addObject(cd2, 227, 335);
        addObject(cd3, 370, 336);
        addObject(cd4, 84, 489);
        addObject(cd5, 228, 490);
        addObject(cd6, 374, 492);
        isi = new isi();
        addObject(isi,160,93);
        total = new isi();
        addObject(total,627,504);
        total.warna=Color.red;
    }
    
     public isi getIsi()
        {
         return isi;
        }
    public isi getTotal()
    {
        return total;
    }
}
