package Questao08;

public class TestePaciente {
    public static void main(String[] args) {
        Paciente p = new Paciente();

        p.peso = 100.0;
        p.altura = 1.86;

        double resultadoImc = p.calcularImC();

        System.out.println("Resultado - peso: " + p.peso + "altura: " + p.altura);
        System.out.printf("IMC: " + resultadoImc);
    }
}
