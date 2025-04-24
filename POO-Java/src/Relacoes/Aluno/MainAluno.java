package Relacoes.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Varlen");
        System.out.println(a1.getNome());

        a1.setIdade(17);
        System.out.println("Idade: " + a1.getIdade());
    }
}
