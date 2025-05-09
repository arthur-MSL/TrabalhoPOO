
package trabalho_final_poo;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected String estadoCivil;
    protected String escolaridade;
    protected String dataNascimento;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
