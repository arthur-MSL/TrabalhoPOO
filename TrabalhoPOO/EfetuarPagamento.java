public class EfetuarPagamento extends Transacoes {
    
    public EfetuarPagamento(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }

    public void realizarPagamento(Conta contaOrigem, Conta contaDestino, double valor, int senha) throws IllegalArgumentException, IllegalStateException {
        if (contaOrigem.getSenha() != senha) {
            System.out.println("Senha incorreta. Acesso negado.");
            return;
        }
        if (contaOrigem.getAtiva() != 1 || contaDestino.getAtiva() != 1) {
            throw new IllegalArgumentException("Uma ou ambas as contas não estão ativas.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        if (valor > contaOrigem.getSaldoAtual()) {
            throw new IllegalStateException("Saldo insuficiente para realizar o pagamento.");
        }
        contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
        contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso de " 
                           + contaOrigem.getNroConta() + " para " + contaDestino.getNroConta() + "!");
    }
    
}
