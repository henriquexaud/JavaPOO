package com.mycompany.papelaria;

public class Cliente {
    String nome;
    String cpf;
    float saldo;
    
    void status(){
        System.out.print("Nome: " + this.nome);
        System.out.print("CPF: " + this.cpf);
        System.out.print("Saldo " + this.saldo);
    }

    void abastecerSaldo(float valor) {
        this.saldo = this.saldo + valor;
    }
    
    void retirarSaldo(float valor){
        this.saldo = this.saldo - valor;
    }
}
