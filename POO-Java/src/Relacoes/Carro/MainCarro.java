package Relacoes.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Gol";
        carro.marca = "VW";
        carro.cor = "Branco";
        carro.ano = 2010;
        carro.vel = 0;
        carro.acelerar(20);
        carro.freiar(10);
        System.out.println(carro.vel);
    }
}
