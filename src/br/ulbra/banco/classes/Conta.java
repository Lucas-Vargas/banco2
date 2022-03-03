package br.ulbra.banco.classes;

import javax.swing.JOptionPane;

public class Conta { 
    public String nome;
    public String numConta;
    public int agencia;
    public double saldo;
    public String login, senha;
    
    public Conta(){
        numConta = "123";
        this.saldo = 0;
        this.agencia = 1;
        this.nome = "Coitus";
    }
    public void mostrarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo: "+this.saldo);
    }
    public void depositar(double v){
        if(v>0){
        this.saldo = this.saldo+v;
        }else{
            JOptionPane.showMessageDialog(null, "Informe valores acima de Zero.");
        }
        }
        
    public void sacar(double v){
        
        if(v<=saldo){
            this.saldo = this.saldo-v;
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
            
        }mostrarSaldo();
    }
    public void status(){
        
    }
    
}
