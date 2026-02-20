package Questao11;

public class Termometro {
    double temperatura;

    void ajustarTemperatura(double novaTemp) {
        if(novaTemp >= -100.0) {
            temperatura = novaTemp;
            System.out.println("Temperatura ajustada para: " + temperatura);
        } else {
            System.out.println("Erro! A temperatura nao pode ser menor que -100");
        
        }
    }
}
