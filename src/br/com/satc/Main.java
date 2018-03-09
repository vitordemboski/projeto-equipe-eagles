/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Pedido;
import br.com.satc.objeto.Prato;
import br.com.satc.singleton.SPrato;
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
        Cliente c = new Cliente("3123123213", "Vinicius", "3123", "123123", sdf.parse("23/08/2000"));
        Prato pr = new Prato("Arroz", "Gostoso", 100);

        Pedido p = new Pedido(c, pr);
        System.out.println(p.toString());

    }

}
