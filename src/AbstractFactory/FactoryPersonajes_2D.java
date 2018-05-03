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
public class FactoryPersonajes_2D implements FactoryPersonajes {

    @Override
    public Soldado crearSoldado() {
        return new Soldado_2D();
    }

    @Override
    public Arquero crearArquero() {
        return new Arquero_2D();
    }
    
}
