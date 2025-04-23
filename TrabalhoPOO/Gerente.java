public class Gerente extends Funcionario {

    private Data dataInicioCarreira;
    private static double comissao;
    private int possuiCursoGerencia; // 1 = possui, 0 = nao possui

    public Gerente(String nome, String cpf, Endereco endereco, int nroCarteiraTrabalho, int rG, String sexo,
            String cargo, double salario, int anoIngresso, Data dataInicioCarreira, double comissao,
            int possuiCursoGerencia) {
        super(nome, cpf, endereco, nroCarteiraTrabalho, rG, sexo, cargo, salario, anoIngresso);
        this.dataInicioCarreira = dataInicioCarreira;
        Gerente.comissao = comissao;
        this.possuiCursoGerencia = possuiCursoGerencia;
    }

    public Data getDataInicioCarreira() {
        return dataInicioCarreira;
    }

    public void setDataInicioCarreira(Data dataInicioCarreira) {
        this.dataInicioCarreira = dataInicioCarreira;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        Gerente.comissao = comissao;
    }

    public int getPossuiCursoGerencia() {
        return possuiCursoGerencia;
    }

    public void setPossuiCursoGerencia(int possuiCursoGerencia) {
        this.possuiCursoGerencia = possuiCursoGerencia;
    }

       
}
