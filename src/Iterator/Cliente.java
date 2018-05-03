/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Luis
 */
public class Cliente {
    public String nombre;
    public String empresa;
    
    public Cliente(String nombre, String empresa) {
        this.nombre = nombre;
        this.empresa = empresa;
    }
    
    public void imprimir() {
        System.out.println("Nombre: "+nombre+" Empresa: "+empresa);
    }
}
