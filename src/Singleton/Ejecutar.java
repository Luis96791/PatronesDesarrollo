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
public class Ejecutar {
    
    public static void main(String[] args) {
        Pelota pelota = Pelota.getPelota((float)67.2, (float)87.3);
        
        pelota.position();
    }
}
