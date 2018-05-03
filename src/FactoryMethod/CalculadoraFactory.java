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
public class CalculadoraFactory {
    
    public Calculadora getCalculadora(Calculadora calculadora) {
        if(calculadora instanceof Estandar) {
            return new Estandar();
        }
        else if(calculadora instanceof Cientifica) {
            return new Cientifica();
        }
        else if(calculadora instanceof Programador) {
            return  new Programador();
        }
        
        return null;
    }
}
