package com.mycompany.papelaria;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente() {
        this.setNome("Fulano");
        this.setCPF("000.000.000-00");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public void status(){
        System.out.print("\n----------");
        System.out.print("\nNome: " + this.getNome());
        System.out.print("\nCPF: " + this.getCPF());
    }
}
