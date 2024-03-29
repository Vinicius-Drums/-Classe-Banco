// Banco.java
package br.senai.devtubaraosc.model;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(int numeroDaConta) {
        contas.removeIf(conta -> conta.getNumeroDaConta() == numeroDaConta);
    }

    public void mostrarContas() {
        System.out.println("\nContas no Banco:");
        for (ContaBancaria conta : contas) {
            conta.mostrarDados();
            System.out.println();
        }
    }
}
