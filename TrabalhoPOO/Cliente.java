public class Cliente extends Pessoa{

    private Agencia agenciaCadastrada;

    public Cliente(){
        this(null, null, null, null);
    }

    public Cliente(String nome, String cpf){
        this(nome, cpf, null, null);
    }

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

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Agência cadastrada: " + agenciaCadastrada.getNome() + " - " + agenciaCadastrada.getNumero());
        
    }
}