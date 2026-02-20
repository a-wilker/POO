package Questao08;

public class Paciente {
    double peso;
    double altura;

    public double calcularImC() {
        return peso / (altura * altura);
    }
}
