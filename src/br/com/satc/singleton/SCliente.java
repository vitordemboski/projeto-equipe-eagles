package br.com.satc.singleton;

import br.com.satc.objeto.Cliente;
import java.util.ArrayList;
import java.util.List;

public class SCliente {
    
    private SCliente() {
    }
    
    public static SCliente getInstance() {
        return SClienteHolder.INSTANCE;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    private static class SClienteHolder {

        private static final SCliente INSTANCE = new SCliente();
    }
    
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    
    
}
