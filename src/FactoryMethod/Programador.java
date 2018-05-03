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
public class Programador implements Calculadora {

    @Override
    public String getTipo() {
        return "Programador";
    }

    @Override
    public int getTeclas() {
        return 16;
    }
    
    @Override
    public String toString() {
        return "Tipo: "+getTipo()+" Teclas: "+getTeclas();
    }
    
}
