/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Luis
 */
public class Cientifica implements Calculadora {

    @Override
    public String getTipo() {
        return "Científica";
    }

    @Override
    public int getTeclas() {
        return 44;
    }
    
    @Override
    public String toString() {
        return "Tipo: "+getTipo()+" Teclas: "+getTeclas();
    }
}
