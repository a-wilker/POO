package Questao01;

public class TestePessoa{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Antonio";
        p1.idade = 23;
        
        System.out.println("Seu nome: " + p1.nome);
        System.out.println("Sua idade: " + p1.idade);
    }
}