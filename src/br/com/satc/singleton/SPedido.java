/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.objeto.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menin
 */
public class SPedido {
    
    private SPedido() {
    }
    
    public static SPedido getInstance() {
        return NewSingletonHolder.INSTANCE;
    }
    List<Pedido> pedidos = new ArrayList<Pedido>();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    private static class NewSingletonHolder {

        private static final SPedido INSTANCE = new SPedido();
    }
}
