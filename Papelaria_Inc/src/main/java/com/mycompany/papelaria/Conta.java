package com.mycompany.papelaria;

public class Conta {
    private int numConta;
    private String tipo;
    private Cliente dono;
    private int saldo;
    private String status;

    public Conta(Cliente dono, String tipo ) {
        this.setDono(dono);
        this.setTipo(tipo);
        this.setSaldo(0);
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(Cliente dono){
        this.dono = dono;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(Cliente cliente){
        this.tipo = n;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public void status(){
        System.out.print("\n----------");
        System.out.print("\nDono: " + this.getDono());
        System.out.print("\nTipo: " + this.getTipo());
        System.out.print("\nSaldo: R$ " + this.getSaldo());
        System.out.print("\nStatus: " + this.status);
    }

    public void depositar(int valor) {
        this.saldo = this.saldo + valor;
        System.out.print("\nDepositando...");
        System.out.print("\nNovo saldo: R$ " + this.saldo);
    }
    
    public void sacar(int valor){
        this.saldo = this.saldo - valor;
        System.out.print("\nSacando...");
        System.out.print("\nNovo saldo: R$ " + this.saldo);
    }
}
