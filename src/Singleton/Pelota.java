/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Luis
 */
public class Pelota {
    private final float x, y;
    private static Pelota pelota;
    
    public static Pelota getPelota(float x, float y) {
        if(pelota == null) {
           pelota = new Pelota(x, y); 
        }
        return pelota;
    }
    
    private Pelota(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void position() {
        System.out.println("x: "+this.x+" y:"+this.y);
    }
    
    
}
