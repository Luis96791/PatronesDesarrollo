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
public class EmpresaIterator implements Iterator<Cliente> {
    private final Cliente[] clientes;
    private int posicion = 0;
    
    public EmpresaIterator(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public boolean hasNext() {
        return (posicion < clientes.length && clientes[posicion] != null);
    }

    @Override
    public Cliente next() {
        return clientes[posicion++];
    }
    
}
