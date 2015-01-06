import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.*;
/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class isi extends Actor
{
    /**
     * Act - do whatever the Data wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public String print=" - ";
    private String nama;
    private int harga;
    private int idx=1;
    public int font_size=30;
    //private int ttl=0;
    public static int ttl;
    public Color warna=Color.red;
    public void act() 
    {
        setImage(new GreenfootImage(print,font_size,warna,null));
        
    }    

    public void setPrint(String is,int ii)
    {
        print=is+"\n Rp. " +ii+ ",-"; 
        harga=ii; 
        nama=is;
        World W=getWorld();
    }
    
    public void setColor(Color x)
    {
        warna=x;
    }
    
    public void font(int i)
    {
        font_size=i;
    }
    
    public void simpan(){
        if(idx==1){
            isi isi1 = new isi();
            getWorld().addObject(isi1,617,251);
            isi1.harga = harga;
            isi1.nama = nama;
            isi1.font_size=20;
            isi1.print = isi1.nama+" "+"Rp. "+isi1.harga+",-";
            ttl+=isi1.harga;
        }
        if(idx==2){
            isi isi2 = new isi();
            getWorld().addObject(isi2,617,281);
            isi2.harga = harga;
            isi2.nama = nama;
            isi2.font_size=20;
            isi2.print = isi2.nama+" "+"Rp. "+isi2.harga+",-";
            ttl+=isi2.harga;
        }
        if(idx==3){
            isi isi3 = new isi();
            getWorld().addObject(isi3,617,311);
            isi3.harga = harga;
            isi3.nama = nama;
            isi3.font_size=20;
            isi3.print = isi3.nama+" "+"Rp. "+isi3.harga+",-";
            ttl+=isi3.harga;
        }
        if(idx==4){
            isi isi4 = new isi();
            getWorld().addObject(isi4,617,341);
            isi4.harga = harga;
            isi4.nama = nama;
            isi4.font_size=20;
            isi4.print = isi4.nama+" "+"Rp. "+isi4.harga+",-";
            ttl+=isi4.harga;
        }
        if(idx==5){
            isi isi5 = new isi();
            getWorld().addObject(isi5,617,371);
            isi5.harga = harga;
            isi5.nama = nama;
            isi5.font_size=20;
            isi5.print = isi5.nama+" "+"Rp. "+isi5.harga+",-";
            ttl+=isi5.harga;
        }
        if(idx==6){
            isi isi6 = new isi();
            getWorld().addObject(isi6,617,401);
            isi6.harga = harga;
            isi6.nama = nama;
            isi6.font_size=20;
            isi6.print = isi6.nama+" "+"Rp. "+isi6.harga+",-";
            ttl+=isi6.harga;
        }
        World w=getWorld();
        ((Template1)w).total.print = "TOTAL :\n"+ttl;
        idx++;
    }
    
    public int getTtl()
    {
        return ttl;
    }
}
