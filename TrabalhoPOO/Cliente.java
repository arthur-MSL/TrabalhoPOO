public class Cliente extends Pessoa{

    private Agencia agenciaCadastrada;

    public Cliente(String nome, String cpf, Endereco endereco, Agencia agenciaCadastrada) {
        super(nome, cpf, endereco);
        this.agenciaCadastrada = agenciaCadastrada;
    }

    public Agencia getAgenciaCadastrada() {
        return agenciaCadastrada;
    }

    public void setAgenciaCadastrada(Agencia agenciaCadastrada) {
        this.agenciaCadastrada = agenciaCadastrada;
    }


    // TEM QUE MUDAR ISSO, FOI SÓ A SUGESTÃO PARA FICAR CORRETO
    @Override
    public void exibirDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDados'");
    }
}