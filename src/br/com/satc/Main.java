/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Pedido;
import br.com.satc.objeto.Prato;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author markson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente c = new Cliente(sdf.parse("08/03/2016"), "34421324", "Otavio", "123", "321", sdf.parse("23/08/2000"));

    }

}
