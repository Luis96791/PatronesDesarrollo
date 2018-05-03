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
public class Arquero_3D extends Arquero {

    @Override
    public String getTipo() {
        return "Arquero 3D";
    }

    @Override
    public ArrayList<String> getArmas() {
        this.armas.add("Lanza");
        this.armas.add("Espada");
        this.armas.add("Escudo");
        return this.armas;
    }

    @Override
    public int getFlechas() {
        return 38;
    }
    
}
