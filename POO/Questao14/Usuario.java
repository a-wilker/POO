package Questao14;

public class Usuario {
    String login;
    String senha;

    public boolean verificarAcesso(String loginDigitado, String senhaDigitada) {
        return login.equals(loginDigitado) && senha.equals(senhaDigitada);
    }
}
