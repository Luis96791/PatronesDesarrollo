/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public abstract class Soldado extends Personaje {
    public float vida;
    
    @Override
    public abstract String getTipo();

    @Override
    public abstract ArrayList<String> getArmas();
    
    public abstract float getVida();
    
    @Override
    public String toString() {
        return getTipo()+" => { %vida: "+getVida()+"}";
    }
}
