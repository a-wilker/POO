package Questao04;

public class TesteLampada {
    public static void main (String[] args){
        Lampada minhaLampada = new Lampada();
        
        System.out.println("A lampada esta ligada? " +minhaLampada.estaLigada);

        minhaLampada.ligar();

        System.out.println("E agora, a lampada esta ligada?" + minhaLampada.estaLigada);

        minhaLampada.desligar();
        System.out.println("Apos desligar: " + minhaLampada.estaLigada);
        

    }
}
