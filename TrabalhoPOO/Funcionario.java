public class Funcionario extends Pessoa{

    private int nroCarteiraTrabalho;
    private int RG;
    private String sexo;
    private String cargo;
    private double salario;
    private int anoIngresso;
    
    public Funcionario(String nome, String cpf, Endereco endereco, int nroCarteiraTrabalho, int rG, String sexo,
            String cargo, double salario, int anoIngresso) {
        super(nome, cpf, endereco);
        this.nroCarteiraTrabalho = nroCarteiraTrabalho;
        RG = rG;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.anoIngresso = anoIngresso;
    }

    public int getNroCarteiraTrabalho() {
        return nroCarteiraTrabalho;
    }

    public void setNroCarteiraTrabalho(int nroCarteiraTrabalho) {
        this.nroCarteiraTrabalho = nroCarteiraTrabalho;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int rG) {
        RG = rG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public void exibirDados() {
       super.exibirDados();
        System.out.println("Número da carteira de trabalho: " + nroCarteiraTrabalho);
        System.out.println("RG: " + RG);
        System.out.println("Sexo: " + sexo);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Ano de ingresso: " + anoIngresso);
    }

}
