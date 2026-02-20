package Questao14;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.login = "will111";
        user.senha = "java123";

        String tentativaLogin = "will111";
        String tentativaSenha = "java123"; 

        System.out.println("Tentativa de login...");
        boolean acessoGarantido = user.verificarAcesso(tentativaLogin, tentativaSenha);

        if(acessoGarantido) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Ero: Login ou senha incorretos.");
        }
    }
}
