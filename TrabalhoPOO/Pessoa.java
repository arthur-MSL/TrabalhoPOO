public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected String estadoCivil;
    protected String escolaridade;
    protected Data dataNascimento;

    public Pessoa(String nome, String cpf, Endereco endereco, String estadoCivil, String escolaridade,
            Data dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        this.dataNascimento = dataNascimento;
    }

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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
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