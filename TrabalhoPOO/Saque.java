public class Saque extends Transacoes {

    public Saque(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }

    public void realizarSaque(Conta conta, double valor, int senha) throws IllegalArgumentException {
        if (conta.getSenha() != senha) {
            throw new IllegalArgumentException("Senha incorreta. Acesso negado.");
        }
        if (conta.getAtiva() != 1) {
            throw new IllegalArgumentException("Conta não está ativa.");
        }
        if (conta.getTipoConta() == 1) { // Conta Corrente
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            if (valor > contaCorrente.getSaldoAtual() + contaCorrente.getLimiteChequeEspecial()) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
            }
        } else if (conta.getTipoConta() == 2) { // Conta Poupança
            if (valor > conta.getSaldoAtual()) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
            }
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > conta.getSaldoAtual()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        conta.setSaldoAtual(conta.getSaldoAtual() - valor);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
    }

}
