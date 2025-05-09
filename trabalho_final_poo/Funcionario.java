
package trabalho_final_poo;

public class Funcionario extends Pessoa implements Imprimivel {
    private int nroCarteiraTrabalho;
    private int RG;
    private String sexo;
    private String cargo;
    private double salario;
    private int anoIngresso;

    public Funcionario() {}

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirResumo() {
        System.out.println("Funcionário: " + nome + " | Cargo: " + cargo);
    }
}
