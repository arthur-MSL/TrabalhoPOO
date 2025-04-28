public class Saque extends Transacoes {

    public Saque(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }

    public void realizarSaque(Conta conta, double valor, int senha) throws OpInvalidaException {
        if (conta.getSenha() != senha) {
            throw new OpInvalidaException("Senha incorreta. Acesso negado.");
        }
        if (conta.getAtiva() != 1) {
            throw new OpInvalidaException("Conta não está ativa.");
        }
        if (conta.getTipoConta() == 1) { // Conta Corrente
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            if (valor > contaCorrente.getSaldoAtual() + contaCorrente.getLimiteChequeEspecial()) {
                throw new OpInvalidaException("Saldo insuficiente para realizar o saque.");
            }
        } else if (conta.getTipoConta() == 2) { // Conta Poupança
            if (valor > conta.getSaldoAtual()) {
                throw new OpInvalidaException("Saldo insuficiente para realizar o saque.");
            }
        }else if (conta.getTipoConta() == 3) { // Conta Salário
            ContaSalario contaSalario = (ContaSalario) conta;
            if (valor > contaSalario.getLimiteSaque()) {
                throw new OpInvalidaException("Valor do saque excede o limite da conta salário.");
            }
        } else {
            throw new OpInvalidaException("Tipo de conta desconhecido.");
        }
        if (valor <= 0) {
            throw new OpInvalidaException("O valor do saque deve ser maior que zero.");
        }
        if (valor > conta.getSaldoAtual()) {
            throw new OpInvalidaException("Saldo insuficiente para realizar o saque.");
        }
        conta.setSaldoAtual(conta.getSaldoAtual() - valor);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
    }

}
