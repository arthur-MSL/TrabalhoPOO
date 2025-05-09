
package trabalho_final_poo;

public class Cliente extends Pessoa implements Imprimivel {
    private Agencia agenciaCadastrada;

    public Cliente() {
        this(null, null, null, null);
    }

    public Cliente(String nome, String cpf) {
        this(nome, cpf, null, null);
    }

    public Cliente(String nome, String cpf, Endereco endereco, Agencia agenciaCadastrada) {
        super(nome, cpf, endereco);
        this.agenciaCadastrada = agenciaCadastrada;
    }

    @Override
    public void imprimirResumo() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }
}
