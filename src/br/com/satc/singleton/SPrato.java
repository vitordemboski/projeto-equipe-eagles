/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.objeto.Prato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPrato {
    
    private SPrato() {
    }
    
    public static SPrato getInstance() {
        return SPratoHolder.INSTANCE;
    }
    
    private static class SPratoHolder {

        private static final SPrato INSTANCE = new SPrato();
    }
    
    private List<Prato> p = new ArrayList<>();

    public List<Prato> getP() {
        return p;
    }

    public void setP(List<Prato> p) {
        this.p = p;
    }
}
