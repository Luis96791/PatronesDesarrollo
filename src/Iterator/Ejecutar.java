/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class Ejecutar {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Correos");
        empresa.add("Cliente 1");
        empresa.add("Cliente 2");
        
        Iterator<Cliente> iterator = empresa.iterator();
        
        while(iterator.hasNext()) {
            Cliente cliente = (Cliente) iterator.next();
            cliente.imprimir();
        }
    }
}
