package br.digitalhouse;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTirular() {
        return titular;
    }

    public void setTirular(Cliente tirular) {
        this.titular = tirular;
    }

    public String deposito (double quantia){
        this.saldo =+ quantia;
        return  "Deposito realizado com sucesso.\n"+"Saldo atual: " + this.saldo;
    }

    public String saque (double quantia){
        if (this.saldo < quantia){
            return "Saldo insuficiente";
        }else{
            this.saldo =- quantia;
            return "Saque efetuado com sucesso\nSaldo atual: "+this.saldo;
        }

    }

    public Conta (Cliente novoCliente, int numeroConta, double saldo){

        titular = novoCliente;
        numeroConta = numeroConta;
        saldo = saldo;

    }


}
