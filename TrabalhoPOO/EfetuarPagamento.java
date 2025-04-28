public class EfetuarPagamento extends Transacoes {
    
    public EfetuarPagamento(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }

    public void realizarPagamento(Conta contaOrigem, Conta contaDestino, double valor, int senha) throws OpInvalidaException {
        if (contaOrigem.getSenha() != senha) {
            System.out.println("Senha incorreta. Acesso negado.");
            return;
        }
        if (contaOrigem.getAtiva() != 1 || contaDestino.getAtiva() != 1) {
            throw new OpInvalidaException("Uma ou ambas as contas não estão ativas.");
        }
        if (valor <= 0) {
            throw new OpInvalidaException("Valor inválido para depósito.");
        }
        if(contaOrigem.getTipoConta() == 1) { // Conta Corrente
            ContaCorrente contaCorrente = (ContaCorrente) contaOrigem;
            if (contaCorrente.getLimiteChequeEspecial() < valor) {
                    throw new OpInvalidaException("Valor do depósito excede o limite da conta corrente.");
                }else if(contaCorrente.getSaldoAtual() < valor) {
                    throw new OpInvalidaException("Saldo insuficiente para realizar o depósito.");
                }else {
                contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
                contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
                System.out.println("Transferência de R$ " + valor + " realizada com sucesso da conta " 
                                + contaOrigem.getNroConta() + " para a conta " + contaDestino.getNroConta() + "!");
                        }
            }

         else if (contaOrigem.getTipoConta() == 2) { // Conta Poupança
            ContaPoupanca contaPoupanca = (ContaPoupanca) contaOrigem;
                if (contaPoupanca.getRendimentoMes() < valor) {
                    throw new OpInvalidaException("Valor do depósito excede o limite da conta poupança.");
                } else if (contaPoupanca.getSaldoAtual() < valor) {
                    throw new OpInvalidaException("Saldo insuficiente para realizar o depósito.");
                }else {
                    contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
                    contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
                    System.out.println("Transferência de R$ " + valor + " realizada com sucesso da conta " 
                                    + contaOrigem.getNroConta() + " para a conta " + contaDestino.getNroConta() + "!");
                }
        }

        else if (contaOrigem.getTipoConta() == 3) { // Conta Salário
            ContaSalario contaSalario = (ContaSalario) contaOrigem;
                if (contaSalario.getSaldoAtual() < valor) {
                    throw new OpInvalidaException("Valor do depósito excede o limite da conta salário.");
                }
                else {
                    contaOrigem.setSaldoAtual(contaOrigem.getSaldoAtual() - valor);
                    contaDestino.setSaldoAtual(contaDestino.getSaldoAtual() + valor);
                    System.out.println("Transferência de R$ " + valor + " realizada com sucesso da conta " 
                                       + contaOrigem.getNroConta() + " para a conta " + contaDestino.getNroConta() + "!");
                }
        } 
        
        else {
            throw new OpInvalidaException("Tipo de conta desconhecido.");
        }

      
    }
}
