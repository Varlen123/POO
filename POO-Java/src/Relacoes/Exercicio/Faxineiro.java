package Relacoes.Exercicio;

public class Faxineiro extends Funcionario {
    private String departamento;
    private float comissao;
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setComissao(float comissao){
        this.comissao = comissao;
    }
    public float getComissao(){
        return comissao;
    }
    
}
