package Questao06;

public class Produto {
    String nome;
    double precoUnitario;
    int quantidade;

    void exibirTotalEstoque() {
        double total = precoUnitario * quantidade;
        System.out.println("Produto: " + nome);
        System.out.println("Valor total em estoque: " + total);
    }
}
