package Questao10;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Antonio";

        Endereco end = new Endereco();
        end.rua = "Bela vista";
        end.cidade = "Teresina";

        p.endereco = end;

        System.out.println("Morador:" + p.nome);
        System.out.println("Cidade: " + p.endereco.cidade);
        System.out.println("Rua: " + p.endereco.rua);
    }
}
