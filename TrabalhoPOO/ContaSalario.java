public class ContaSalario extends Conta {
    
    private double limiteSaque;
    private double limiteTransferencia;

    public ContaSalario(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Agencia agenciaLigada, double limiteSaque, double limiteTransferencia) {
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, agenciaLigada);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }
    
    public ContaSalario(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Agencia agenciaLigada, double limiteSaque, double limiteTransferencia) { // Conta com 1 cliente
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, agenciaLigada);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }

    public ContaSalario(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Cliente cliente2, Agencia agenciaLigada, double limiteSaque,
            double limiteTransferencia) { // Conta com 2 clientes
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, cliente2, agenciaLigada);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getLimiteTransferencia() {
        return limiteTransferencia;
    }

    public void setLimiteTransferencia(double limiteTransferencia) {
        this.limiteTransferencia = limiteTransferencia;
    }

    @Override

    public int getTipoConta(){
        return 3; // Conta Salario

    }
}
