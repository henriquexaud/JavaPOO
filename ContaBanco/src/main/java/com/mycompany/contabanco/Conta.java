package com.mycompany.contabanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    public Conta(){
        this.saldo = 0;
        this.status = false;
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(int num, String tipo, String dono) {
        if(isStatus() == true)
        { 
            System.out.println("Conta já foi aberta.");
        }
        else if (tipo == "cc"){
            setSaldo(50);
        } else if (tipo == "cp"){
            setSaldo(150);
        } else {
            System.out.println("Não é possível abrir conta.");
            return;
        }

        setStatus(true);
        setNumConta(num);
        setTipo(tipo);
        setDono(dono);
    }

    public void fecharConta() {
        if(isStatus() == false)
        { 
            System.out.println("Conta já está fechada.");
        }
        else if(getSaldo() == 0) {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Não pode fechar a conta enquanto tiver saldo ou dívida");
        }
    } 

    public void depositar(int valor) {
        setSaldo(getSaldo() + valor);
    } 

    public void sacar(int valor) {
        setSaldo(getSaldo() - valor);
    }
    
    public void status() {
        if(isStatus() == false)
        { 
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Conta ainda não foi aberta.");
        }else{
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Nº: " + getNumConta());
            System.out.println("Dono: " + getDono());
            System.out.println("Tipo: " + getTipo().toUpperCase());
            System.out.println("Saldo: " + getSaldo());
        }
    }
}