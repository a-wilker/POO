package Questao03;

public class TesteConta {
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        minhaConta.numero = 102030;
        minhaConta.saldo = 50.00;

        System.out.println("Saldo inicial: " + minhaConta.saldo);

        double valorDeposito = 20.00;
        minhaConta.saldo = minhaConta.saldo + valorDeposito;

        System.out.println("Deposito : R$ " + valorDeposito);
        System.out.println("Saldo final: " + minhaConta.numero + "R$" + minhaConta.saldo);

    }
}
