public class ConsultarSaldo extends Transacoes {
    
    public ConsultarSaldo(Conta conta, Data dataTransacao, String canalOndeFoiFeita) {
        super(conta, dataTransacao, canalOndeFoiFeita);
    }

    public void realizarConsulta(Conta conta, int senha) throws OpInvalidaException {
        if (conta.getSenha() == senha) {
            System.out.println("Saldo atual: R$ " + conta.getSaldoAtual());
        if(conta.getAtiva() != 1) {
            throw new OpInvalidaException("Conta inativa. Não é possível realizar a consulta.");    
            
        
            } else if (conta.getTipoConta() == 1) { // Conta Corrente
                ContaCorrente contaCorrente = (ContaCorrente) conta;
                System.out.println("Tipo de conta: Conta Corrente");
                System.out.println("Limite Cheque Especial: R$ " + contaCorrente.getLimiteChequeEspecial());
                System.out.println("Taxa Administrativa: R$ " + contaCorrente.getLaxaAdministrativa());
                System.out.println("Saldo total disponível: R$ " + (conta.getSaldoAtual() + contaCorrente.getLimiteChequeEspecial()));
            
            } else if (conta.getTipoConta() == 2) { // Conta Poupança
                System.out.println("Tipo de conta: Conta Poupança");
                System.out.println("Saldo total disponível: R$ " + conta.getSaldoAtual());
            
            }else if (conta.getTipoConta() == 3) { // Conta Salário
                ContaSalario contaSalario = (ContaSalario) conta;
                System.out.println("Tipo de conta: Conta Salário");
                System.out.println("Limite Saque: R$ " +  contaSalario.getLimiteSaque());
                System.out.println("Taxa Administrativa: R$ " + contaSalario.getLimiteTransferencia ());
                System.out.println("Saldo total disponível: R$ " + conta.getSaldoAtual());
            
            }else {
                throw new OpInvalidaException("Tipo de conta desconhecido.");    
            }
        }
    }
    
}
