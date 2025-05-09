public class ContaPoupanca extends Conta {
    
    private double rendimentoMes;

    public ContaPoupanca(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Agencia agenciaLigada, double rendimentoMes) {
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, agenciaLigada);
        this.rendimentoMes = rendimentoMes;
    }

    public ContaPoupanca(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Agencia agenciaLigada, double rendimentoMes) { // Conta com 1 cliente
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, agenciaLigada);
        this.rendimentoMes = rendimentoMes;
    }

    public ContaPoupanca(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Cliente cliente2, Agencia agenciaLigada, double rendimentoMes) { // Conta com 2 clientes
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, cliente2, agenciaLigada);
        this.rendimentoMes = rendimentoMes;
    }

    public double getRendimentoMes() {
        return rendimentoMes;
    }

    public void setRendimentoMes(double rendimentoMes) {
        this.rendimentoMes = rendimentoMes;
    }

    @Override

    public int getTipoConta(){
        return 2; // Conta Poupanca

    }

}
