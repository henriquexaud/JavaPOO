package com.mycompany.papelaria;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.print("Uma caneta " + this.modelo);
        System.out.print(" de cor " + this.cor);
        System.out.print(", ponta " + this.ponta);
        System.out.print(", carga em " + this.carga + "%");
        if (this.tampada == true)
            System.out.println(" e está tampada.");
        else 
            System.out.println(" e está destampada.");
    }

    void rabiscar() {
        if (this.tampada == true)
            System.out.println("Não posso rabiscar.");
        else 
            System.out.println("Estou rabiscando.");
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
