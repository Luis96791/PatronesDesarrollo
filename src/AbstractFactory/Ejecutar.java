/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Luis
 */

public class Ejecutar {
    public static FactoryPersonajes factoryPersonajes;
    public static Soldado soldado;
    public static Arquero arquero;        
    
    public static void main(String[] args) {
        factoryPersonajes = new FactoryPersonajes_2D();
        soldado = factoryPersonajes.crearSoldado();
        arquero = factoryPersonajes.crearArquero();
        
        System.out.println(soldado);
        System.out.println(arquero);
        
        factoryPersonajes = new FactoryPersonajes_3D();
        soldado = factoryPersonajes.crearSoldado();
        arquero = factoryPersonajes.crearArquero();
        
        System.out.println(soldado);
        System.out.println(arquero);
    }
}
