// ContaBancaria.java
package br.senai.devtubaraosc.model;
import br.senai.devtubaraosc.model.interfaces.Imprimivel;

public class ContaBancaria implements Imprimivel {
    private int numeroDaConta;
    private int agencia;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, int agencia, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Titular: " + nomeDoTitular);
        System.out.println("Saldo: R$" + saldo);
    }
}
