import java.util.Scanner;  
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
            int opccao;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            do{
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Cadastrar Funcionario");
                System.out.println("3 - Cadastrar Agencia");
                System.out.println("0 - Sair");
                opccao = scanner.nextInt();
                switch(opccao){
                    case 1:
                        //cadastrar cliente
                        break;
                    case 2:
                        // cadastrar funcionario
                        break;
                    case 3:
                        // cadastrar agencia
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                } while (opccao != 0);
            }
        }
    }
  