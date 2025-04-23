public class Deposito extends Transacoes {
    
    public Deposito(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }
    
    public void realizarDeposito(Conta contaOrigem, Conta contaDestino, double valor, int senha) throws IllegalArgumentException {
        if (contaOrigem.getSenha() != senha) {
            System.out.println("Senha incorreta. Acesso negado.");
            return;
        }
        if (contaOrigem.getAtiva() != 1 || contaDestino.getAtiva() != 1) {
            throw new IllegalArgumentException("Uma ou ambas as contas não estão ativas.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito.");
        }
        if (contaOrigem.getSaldoAtual() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente na conta de origem.");
        }
        contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
        contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
        System.out.println("Transferência de R$ " + valor + " realizada com sucesso da conta " 
                           + contaOrigem.getNroConta() + " para a conta " + contaDestino.getNroConta() + "!");
    }
}
