

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public static boolean validarCPF(String cpf) {
        
        cpf = cpf.replaceAll("[^\\d]", "");// remove pontos e traços

        if (cpf.length() != 11) return false;

        boolean todosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosIguais = false;
                break;
            }
        }
        if (todosIguais) return false;

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int num = Character.getNumericValue(cpf.charAt(i));
            soma += num * (10 - i);
        }
        int resto = soma % 11;
        int dig1 = (resto < 2) ? 0 : 11 - resto;
        soma = 0;

        for (int i = 0; i < 10; i++) {
            int num = Character.getNumericValue(cpf.charAt(i)); //transformar o cpf em inteiro
            soma += num * (11 - i);
        }

        resto = soma % 11;
        int dig2 = (resto < 2) ? 0 : 11 - resto;
        return dig1 == Character.getNumericValue(cpf.charAt(9)) &&
               dig2 == Character.getNumericValue(cpf.charAt(10));
    }

    public abstract void exibirDados(); // metodo abstrato para exibir dados da pessoa(cada classe implementa de um jeito diferente)

}