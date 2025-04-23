public abstract class Conta {

    protected int nroConta;
    protected double saldoAtual;
    protected Data dataAbertura;
    protected Data dataUltMovimentacao;
    private int senha;
    protected int ativa; // 1 = ativa, 0 = desativada
    protected Cliente cliente1;
    protected Cliente cliente2;
    protected Agencia agenciaLigada;

    public Conta(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Agencia agenciaLigada) {
        this.nroConta = nroConta;
        this.saldoAtual = saldoAtual;
        this.dataAbertura = dataAbertura;
        this.dataUltMovimentacao = dataUltMovimentacao;
        this.senha = senha;
        this.ativa = ativa;
        this.agenciaLigada = agenciaLigada;
    }
    
    public Conta(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha, int ativa,
            Cliente cliente1, Agencia agenciaLigada) { // Conta com 1 cliente
        this.nroConta = nroConta;
        this.saldoAtual = saldoAtual;
        this.dataAbertura = dataAbertura;
        this.dataUltMovimentacao = dataUltMovimentacao;
        this.senha = senha;
        this.ativa = ativa;
        this.cliente1 = cliente1;
        cliente2 = null;
        this.agenciaLigada = agenciaLigada;
    }

    public Conta(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha, int ativa,
            Cliente cliente1, Cliente cliente2, Agencia agenciaLigada) { // Conta com 2 clientes
        this.nroConta = nroConta;
        this.saldoAtual = saldoAtual;
        this.dataAbertura = dataAbertura;
        this.dataUltMovimentacao = dataUltMovimentacao;
        this.senha = senha;
        this.ativa = ativa;
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.agenciaLigada = agenciaLigada;
    }

    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Data getDataUltMovimentacao() {
        return dataUltMovimentacao;
    }

    public void setDataUltMovimentacao(Data dataUltMovimentacao) {
        this.dataUltMovimentacao = dataUltMovimentacao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getAtiva() {
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    public Agencia getAgenciaLigada() {
        return agenciaLigada;
    }

    public void setAgenciaLigada(Agencia agenciaLigada) {
        this.agenciaLigada = agenciaLigada;
    }


}
