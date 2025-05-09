public class ContaCorrente extends Conta {
    
    private double limiteChequeEspecial;
    private double laxaAdministrativa;

    public ContaCorrente(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Agencia agenciaLigada, double limiteChequeEspecial, double laxaAdministrativa) {
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, agenciaLigada);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.laxaAdministrativa = laxaAdministrativa;
    }
    
    public ContaCorrente(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Agencia agenciaLigada, double limiteChequeEspecial,
            double laxaAdministrativa) { // Conta com 1 cliente
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, agenciaLigada);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.laxaAdministrativa = laxaAdministrativa;
    }

    public ContaCorrente(int nroConta, double saldoAtual, Data dataAbertura, Data dataUltMovimentacao, int senha,
            int ativa, Cliente cliente1, Cliente cliente2, Agencia agenciaLigada, double limiteChequeEspecial,
            double laxaAdministrativa) { // Conta com 2 clientes
        super(nroConta, saldoAtual, dataAbertura, dataUltMovimentacao, senha, ativa, cliente1, cliente2, agenciaLigada);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.laxaAdministrativa = laxaAdministrativa;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLaxaAdministrativa() {
        return laxaAdministrativa;
    }

    public void setLaxaAdministrativa(double laxaAdministrativa) {
        this.laxaAdministrativa = laxaAdministrativa;
    }
    
    @Override

    public int getTipoConta(){
        return 1; // Conta Corrente

    }
}
