package Questao12;

public class Estudante {
    double[] notas = new double[4];

    double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
