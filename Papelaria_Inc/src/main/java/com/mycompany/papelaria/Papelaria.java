package com.mycompany.papelaria;

public class Papelaria {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Alberto");
        cliente1.setCPF("332.675.832-04");

        cliente1.status();
    }
}
