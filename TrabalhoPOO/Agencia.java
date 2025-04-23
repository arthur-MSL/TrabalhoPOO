public class Agencia {

    private int numero;
    private String nome;
    private Endereco endereco;
    private Gerente gerente;
    private Funcionario[] funcionarios;

    public Agencia(int numero, String nome, Endereco endereco, Gerente gerente, Funcionario[] funcionarios) {
        this.numero = numero;
        this.nome = nome;
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
