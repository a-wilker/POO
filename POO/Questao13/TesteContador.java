package Questao13;

public class TesteContador {
    public static void main (String[] args) {
        Contador meuContador = new Contador();

        meuContador.incrementar();
        meuContador.incrementar();
        meuContador.incrementar();
        meuContador.incrementar();
        meuContador.incrementar();

        meuContador.exibirAteAtual();
    }
}
