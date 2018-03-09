package br.com.satc.objeto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Pessoa {
    private String nome,rg,cpf;
    private Date datanascimento;
    private char status;
    private int idade;

    public Pessoa(String nome, String rg, String cpf, Date datanascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.status = 'A';
        this.idade = calculaIdade(datanascimento);
    }
    
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", datanascimento=" + sdf.format(datanascimento)+ ", status=" + status + ", idade=" + idade + '}';
    }
    
    
     public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }

    return idade;
}
    
    
    
    
    
}

 
