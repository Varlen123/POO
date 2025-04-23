package Relacoes.Carro;

public class Carro {
    String nome;
    String marca;
    String cor;
    int ano;
    int vel;
    int freio;

    void acelerar(int aceleracao){
        vel += aceleracao;
    }

    void freiar(int freio){
        vel -= freio;
    }

}
