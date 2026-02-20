package Questao06;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        
        p.nome = "Teclado";
        p.precoUnitario = 250.00;
        p.quantidade = 10;

        p.exibirTotalEstoque();
    }
}
