package Relacoes.Exercicio;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

       // Vendedor vendedor2 = (Vendedor) new Funcionario();
        //evitar downcast
    }
}
