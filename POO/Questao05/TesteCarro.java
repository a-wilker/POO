package Questao05;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.ano = 2000;

        Carro carro2 = new Carro();
        carro2.modelo = "Corola";
        carro2.ano = 2010;

        System.out.println("Carro 1 - modelo: " + carro1.modelo + " ano: " + carro1.ano);
        System.out.println("Carro 2 - modelo: " + carro2.modelo + " ano: " + carro2.ano);
    }
}