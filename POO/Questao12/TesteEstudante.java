package Questao12;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        est.notas[0] = 8.5;
        est.notas[1] = 7.0;
        est.notas[2] = 5.0;
        est.notas[3] = 6.8;

        double mediaFinal = est.calcularMedia();

        System.out.println("Notas: ");
        for(double n : est.notas) {
            System.out.print(n + " ");
        }

        System.out.printf("Media: " + mediaFinal);
    }
}
