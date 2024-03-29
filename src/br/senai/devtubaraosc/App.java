// App.java
package br.senai.devtubaraosc;

import br.senai.devtubaraosc.model.Banco;
import br.senai.devtubaraosc.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        // Criando uma instância de Banco
        Banco banco = new Banco();

        // Criando algumas instâncias de ContaBancaria e adicionando ao banco
        ContaBancaria conta1 = new ContaBancaria(1234, 5678, "Dave Grohl", 1500.0);
        ContaBancaria conta2 = new ContaBancaria(5678, 1234, "Chad Smith", 2500.0);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Mostrando as contas no banco
        banco.mostrarContas();
    }
}
