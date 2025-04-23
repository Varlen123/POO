package Relacoes.Produtos;

public class MainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camisa";
        p1.marca = "Adidas";
        p1.valor = 100;
        Produto p2 = new Produto("Camisaaa", "Nikeee");
        p2.valor = 20.21f;
        Produto p3 = new Produto("Camisa", "Nike", 50);

        System.out.println("Nome:" + p1.nome + "Marca:" + p1.marca + "Valor:" + p1.valor);
        System.out.println("Nome:" + p2.nome + "Marca:" + p2.marca + "Valor:" + p2.valor);
        System.out.println("Nome:" + p3.nome + "Marca:" + p3.marca + "Valor:" + p3.valor);  
    }
}
