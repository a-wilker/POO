package Questao13;

public class Contador {
    int valor;

    void incrementar(){
        valor++;
    }

    void exibirAteAtual(){
        int i = 0;
        System.out.println("Contagem progressiva ate " + valor);
        while (i <= valor) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
    }
}
