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
public class Arquero_2D extends Arquero {

    @Override
    public String getTipo() {
        return "Arquero 2D";
    }

    @Override
    public ArrayList<String> getArmas() {
        this.armas.add("Arco");
        this.armas.add("Flechas");
        return this.armas;
    }

    @Override
    public int getFlechas() {
        return 23;
    }
    
}
