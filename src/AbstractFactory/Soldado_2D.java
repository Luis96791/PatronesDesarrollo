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
public class Soldado_2D extends Soldado {

    @Override
    public String getTipo() {
        return "Soldado 2D";
    }

    @Override
    public ArrayList<String> getArmas() {
        this.armas.add("Lanza");
        this.armas.add("Espada");
        this.armas.add("Escudo");
        return  this.armas;
    }

    @Override
    public float getVida() {
        return (float) 90.5;
    }
    
}
