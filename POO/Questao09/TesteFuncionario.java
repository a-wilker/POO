package Questao09;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.salario = 3000.00;
        System.out.println("Salario inicial: " + f.salario);

        double taxaAumento = 10.0;
        f.aumentarSalario(taxaAumento);

        System.out.println("Aumento aplicado: " + taxaAumento + "%");
        System.out.println("Novo salário: R$ " + f.salario);
    }
}
