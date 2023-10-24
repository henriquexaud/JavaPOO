package com.mycompany.contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        System.out.println("Aplicação Conta Banco!");
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.abrirConta(1, "cc", "Henrique");
        c1.status();
        c2.status();
    }
}
