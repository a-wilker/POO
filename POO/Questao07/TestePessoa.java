package Questao07;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Will";
        p.idade = 23;

        boolean resultado = p.ehMaiorDeIdade();
        System.out.println("Nome: " + p.nome);
        System.out.println("E maior de idade? " + resultado);

        if (p.ehMaiorDeIdade()) {
            System.out.println(p.nome + " e maior de idade ");
        } else {
            System.out.println(p.nome + " ainda e menor de idade ");   
        }
    }
}
