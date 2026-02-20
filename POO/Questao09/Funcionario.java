package Questao09;

public class Funcionario {
    double salario;
    
    void aumentarSalario(double percentual) {
        salario += (salario * percentual / 100);

    }
}
