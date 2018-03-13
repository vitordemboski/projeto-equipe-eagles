/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

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
    private float desconto2;

    public Pedido(Cliente cliente, Prato prato) {
        this.pratos = new ArrayList<>();
        this.pratos.add(prato);
        this.cliente = cliente;
        this.valorTotal = calcularValorTotal();
        this.status = 'A';
        this.desconto = calcularDesconto();
        this.desconto2 = mostrarDesconto();
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

    public float calcularValorTotal() {
        float valorttl = 0;
        for (Prato prato : this.pratos) {
            valorttl += prato.getValor();
            valorttl = valorttl * calcularDesconto();
        }
        return valorttl;
    }

    public float calcularDesconto() {

        this.desconto = cliente.getTempoCliente() * 10;
        this.desconto = this.desconto / 100;
        this.desconto = 1 - this.desconto;
        return this.desconto;

    }
      public float mostrarDesconto() {

       float valorttl = 0;
        for (Prato prato : this.pratos) {
            valorttl += prato.getValor();
            desconto2 = valorttl - valorTotal;
        }
        return desconto2;

    }

    @Override
    public String toString() {
        return " Pratos: " + this.pratos + ",\n Cliente: " + this.cliente
                + ",\n Valor Total: " + this.valorTotal + ",\n Desconto: " + this.desconto2 + '.';
    }

}
