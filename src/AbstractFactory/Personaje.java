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
public abstract class Personaje {
    public String tipo;
    public ArrayList<String> armas;
    
    public abstract String getTipo();
    public abstract ArrayList<String> getArmas();
    
    @Override
    public String toString() {
        return getTipo();
    }
}
