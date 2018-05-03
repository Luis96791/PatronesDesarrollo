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
public class Empresa {
    private final Cliente[] clientes = new Cliente[20];
    private int numero = 0;
    private final String nombreEmpresa;
    
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public void add(String nombreCliente) {
        Cliente cliente = new Cliente(nombreCliente, nombreEmpresa);
        clientes[numero++] = cliente;
    }
    
    public EmpresaIterator iterator() {
        return new EmpresaIterator(clientes);
    }
}
