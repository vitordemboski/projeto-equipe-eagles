/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import br.com.satc.singleton.SCliente;
import java.util.ArrayList;

/**
 *
 * @author menin
 */
public class Pedido {

    private ArrayList<Prato> pratos;
    private Cliente cliente;
    private float valorTotal;
    private char status;
    private float desconto;

    public Pedido(Cliente cliente, Prato prato) {
        this.pratos = new ArrayList<>();
        this.pratos.add(prato);
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.status = 'A';
        this.desconto = desconto;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valotTotal) {
        this.valorTotal = valotTotal;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public static float calcularValorTotal() {
        Pedido p = null;
        float valortotal = calcularDesconto() * p.valorTotal;
        return valortotal;
    }

    public static float calcularDesconto() {
        Cliente c = null;
        float desconto = c.getTempoCliente() * 10;
        desconto = desconto / 100;
        desconto = 1 - desconto;
        return desconto;

    }

    @Override
    public String toString() {
        return "Pratos: " + pratos + ", cliente: " + cliente
                + ", valotTotal: " + valorTotal + ", desconto: " + desconto + '.';
    }

}
