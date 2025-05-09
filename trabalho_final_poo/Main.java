
package trabalho_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static ArrayList<Agencia> agencias = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n====== Sistema da Instituição Financeira ======");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Cadastrar Agencia");
            System.out.println("4 - Listar Clientes");
            System.out.println("5 - Validar CPF");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch(opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpfCliente = scanner.nextLine();

                    if (!ValidadorCPF.validarCPF(cpfCliente)) {
                        System.out.println("CPF inválido!");
                        break;
                    }

                    Cliente novoCliente = new Cliente(nomeCliente, cpfCliente);
                    clientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("CPF do funcionário: ");
                    String cpfFuncionario = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    Funcionario f = new Funcionario();
                    f.setNome(nomeFuncionario);
                    f.setCpf(cpfFuncionario);
                    f.setCargo(cargo);
                    f.setSalario(salario);
                    funcionarios.add(f);

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Número da agência: ");
                    int numeroAgencia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome fictício: ");
                    String nomeAgencia = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();

                    Endereco endereco = new Endereco(estado, cidade, rua);
                    Agencia novaAgencia = new Agencia(numeroAgencia, nomeAgencia, endereco, null, new Funcionario[0]);
                    agencias.add(novaAgencia);

                    System.out.println("Agência cadastrada com sucesso!");
                    break;

                case 4:
                    System.out.println("Clientes cadastrados:");
                    for (Cliente c : clientes) {
                        c.imprimirResumo();
                    }
                    break;

                case 5:
                    System.out.print("Digite o CPF para validar: ");
                    String cpfVal = scanner.nextLine();
                    boolean valido = ValidadorCPF.validarCPF(cpfVal);
                    System.out.println(valido ? "CPF válido!" : "CPF inválido!");
                    break;

                case 0:
                    System.out.println("Encerrando sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
