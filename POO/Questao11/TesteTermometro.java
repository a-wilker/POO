package Questao11;

public class TesteTermometro {
    public static void main(String[] args){
        Termometro t = new Termometro();

        System.out.println("Tentando ajustar para 25 graus");
        t.ajustarTemperatura(25.0);

        System.out.println("Tentando ajustar para -150 graus");
        t.ajustarTemperatura(-150.0);

        System.out.println("Temperatura final no termometro: " + t.temperatura);
    }
}
