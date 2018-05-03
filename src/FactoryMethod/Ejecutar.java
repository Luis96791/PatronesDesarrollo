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
public class Ejecutar {
    
    public static void main(String[] args) {
        Calculadora calculadora;
        CalculadoraFactory calculadoraFactory = new CalculadoraFactory();
        
        calculadora = new Estandar();
        calculadora = calculadoraFactory.getCalculadora(calculadora);
        System.out.println(calculadora);
        
        calculadora = new Cientifica();
        calculadora = calculadoraFactory.getCalculadora(calculadora);
        System.out.println(calculadora);
        
        calculadora = new Programador();
        calculadora = calculadoraFactory.getCalculadora(calculadora);
        System.out.println(calculadora);
    }
}
