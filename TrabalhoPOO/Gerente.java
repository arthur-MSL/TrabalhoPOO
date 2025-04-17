public class Gerente extends Funcionario {
    private double comissao;

    public Gerente(String nome, String cpf, Endereco endereco, String cargo, double salario, double comissao) {
        super(nome, cpf, endereco, cargo, salario);
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }   
    protected void setComissao(double comissao) {
        this.comissao = comissao;
    }
       
}
