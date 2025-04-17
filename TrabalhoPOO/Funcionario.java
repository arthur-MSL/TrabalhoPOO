public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, String cpf, Endereco endereco, String cargo, double salario) {
        super(nome, cpf, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    protected void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco().getRua() + ", " + getEndereco().getCidade() + ", " + getEndereco().getEstado());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }
    
}
