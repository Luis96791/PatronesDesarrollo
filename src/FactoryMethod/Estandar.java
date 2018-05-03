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
public class Estandar implements Calculadora {

    @Override
    public String getTipo() {
        return "Estandar";
    }

    @Override
    public int getTeclas() {
        return 25;
    }
    
    @Override
    public String toString() {
        return "Tipo: "+getTipo()+" Teclas: "+getTeclas();
    }
    
}
