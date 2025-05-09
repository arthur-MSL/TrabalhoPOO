
package trabalho_final_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();

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
            System.out.println("3 - Listar Clientes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch(opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpfCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, cpfCliente);
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    Funcionario funcionario = new Funcionario();
                    System.out.print("Nome do funcionário: ");
                    funcionario.nome = scanner.nextLine();
                    System.out.print("CPF do funcionário: ");
                    funcionario.cpf = scanner.nextLine();
                    System.out.print("Cargo: ");
                    funcionario.setCargo(scanner.nextLine());
                    System.out.print("Salário: ");
                    funcionario.setSalario(scanner.nextDouble());
                    scanner.nextLine();
                    funcionarios.add(funcionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Lista de clientes:");
                    for (Cliente c : clientes) {
                        c.imprimirResumo();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
