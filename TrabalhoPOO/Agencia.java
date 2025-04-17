public class Agencia {

    private int numero;
    private Endereco endereco;
    private Gerente gerente;
    private Funcionario[] funcionarios;

    public Agencia(int numero, Endereco endereco, Gerente gerente, Funcionario[] funcionarios) {
        this.numero = numero;
        this.endereco = endereco;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

}
