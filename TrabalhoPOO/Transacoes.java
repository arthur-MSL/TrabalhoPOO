public abstract class Transacoes {

    private Conta conta;
    private Data dataTransacao;
    private String canalOndeFoiFeita;
    
    public Transacoes(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        this.conta = conta;
        this.dataTransacao = dataTransacao;
        this.canalOndeFoiFeita = canalOndeFoiFeita;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Data getDataTransacao() {
        return dataTransacao;
    }
    public void setDataTransacao(Data dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    public String getCanalOndeFoiFeita() {
        return canalOndeFoiFeita;
    }
    public void setCanalOndeFoiFeita(String canalOndeFoiFeita) {
        this.canalOndeFoiFeita = canalOndeFoiFeita;
    }
    
    
}
