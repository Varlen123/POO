package Relacoes.Aluno;

public class Aluno {
    private String nome;
    private int idade;
    public String curso;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
     if(idade > 0 && idade < 100){
        this.idade = idade;
        System.out.println("idade cadastrada");
     }else{
        System.out.println("idade invalida");
     }
    }
}
