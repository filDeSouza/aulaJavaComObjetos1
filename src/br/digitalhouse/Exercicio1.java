package br.digitalhouse;

public class Exercicio1 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jose");
        cliente1.setSobrenome("da Silva");
        Conta conta1 = new Conta(cliente1, 11223, 22.32);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");
        cliente2.setSobrenome("de Souza");
        Conta conta2 = new Conta(cliente2, 757513, 766651.32);

        conta1.deposito(2323.00);
        System.out.println(conta1.deposito(2323.00));
        conta2.deposito(1341.00);

        conta1.saque(231.31);
        conta2.saque(31311.12);

    }

}
