import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Template2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Template2 extends World
{
    public isi total;
    public Teks out;
    public Teks h1;
    public Teks h2;
    public Kalkulator hitung;
    public Back back;
    /**
     * Constructor for objects of class Template2.
     * 
     */
    public Template2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Kalkulator k1 = new Kalkulator();
        addObject(k1,111,417);
        k1.setImg("1.png");
        k1.setX(1);
        
        Kalkulator k2 = new Kalkulator();
        addObject(k2,208,417);
        k2.setImg("2.png");
        k2.setX(2);
        
        Kalkulator k3 = new Kalkulator();
        addObject(k3,303,417);
        k3.setImg("3.png");
        k3.setX(3);
        
        Kalkulator k4 = new Kalkulator();
        addObject(k4,111,339);
        k4.setImg("4.png");
        k4.setX(4);
        
        Kalkulator k5 = new Kalkulator();
        addObject(k5,208,339);
        k5.setImg("5.png");
        k5.setX(5);
        
        Kalkulator k6 = new Kalkulator();
        addObject(k6,303,339);
        k6.setImg("6.png");
        k6.setX(6);
        
        Kalkulator k7 = new Kalkulator();
        addObject(k7,111,258);
        k7.setImg("7.png");
        k7.setX(7);
        
        Kalkulator k8 = new Kalkulator();
        addObject(k8,208,258);
        k8.setImg("8.png");
        k8.setX(8);
        
        Kalkulator k9 = new Kalkulator();
        addObject(k9,303,258);
        k9.setImg("9.png");
        k9.setX(9);
        
        Kalkulator k0 = new Kalkulator();
        addObject(k0,394,257);
        k0.setImg("0.png");
        k0.setX(0);
        
        Kalkulator kc = new Kalkulator();
        addObject(kc,400,375);
        kc.setImg("C.png");
        kc.setX(10);
        
        hitung = new Kalkulator();
        addObject(hitung,633,537);
        hitung.setImg("shopping-cart-icon.png");hitung.setX(11);
        
        total = new isi();
        addObject(total,630,265);
        total.print=total.getTtl()+"";
        total.setColor(Color.red);
        total.font(30);
        
        out = new Teks();
        addObject(out,300,130);
        
        h1 = new Teks();
        addObject(h1,630,130);
        h1.setFont(30);
        h1.setColor(Color.red);
        
        h2 = new Teks();
        addObject(h2,635,390);
        h2.setFont(30);
        h2.setColor(Color.red);
        
        back = new Back();
        addObject(back,108,540);
    }
    
    public Teks getOut()
    {
        return out;
    }
}
