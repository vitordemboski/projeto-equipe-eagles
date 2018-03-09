package br.com.satc.objeto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Pessoa{
    
    private Date dataCadastro;
    private String numeroCelular;
    private int tempoCliente;

    public Cliente(Date dataCadastro, String numeroCelular, String nome, String rg, String cpf, Date datanascimento) {
        super(nome, rg, cpf, datanascimento);
        this.dataCadastro = dataCadastro;
        this.numeroCelular = numeroCelular;
        this.tempoCliente = calculatempo(dataCadastro);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getTempoCliente() {
        return tempoCliente;
    }

    public void setTempoCliente(int tempoCliente) {
        this.tempoCliente = tempoCliente;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Cliente{" + "dataCadastro=" + sdf.format(dataCadastro)+ ", numeroCelular=" + numeroCelular + ", tempoCliente=" + tempoCliente + '}';
    }

    
     public static int calculatempo(java.util.Date dataCadastro) {

    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataCadastro); 
    Calendar hoje = Calendar.getInstance();  

    int tempoCliente = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      tempoCliente--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            tempoCliente--; 
        }
    }

    return tempoCliente;
}
     
   
    
    
    
    
    
    
}
