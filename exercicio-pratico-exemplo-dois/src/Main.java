import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um scanner para entrada de dados

    // Criação do primeiro objeto Pessoais
    System.out.println("Digite os dados da primeira pessoa:");
    System.out.print("Nome: ");
    String nome1 = scanner.nextLine(); // Lê o nome da primeira pessoa
    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
    String dataNascimento1 = scanner.nextLine(); // Lê a data de nascimento da primeira pessoa
    System.out.print("Idade: ");
    int idade1 = scanner.nextInt(); // Lê a idade da primeira pessoa
    scanner.nextLine(); // Limpa o scanner

    DadosPessoais pessoa1 = new DadosPessoais(nome1, dataNascimento1, idade1); // Cria o primeiro objeto

    // Criação do segundo objeto Pessoais
    System.out.println("\nDigite os dados da segunda pessoa:");
    System.out.print("Nome: ");
    String nome2 = scanner.nextLine();
    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
    String dataNascimento2 = scanner.nextLine();
    System.out.print("Idade: ");
    int idade2 = scanner.nextInt();

    DadosPessoais pessoa2 = new DadosPessoais(nome2, dataNascimento2, idade2);

    // Imprime os dados das pessoas criadas

    System.out.println("\nDados da primeira pessoa:");
    pessoa1.imprimeDadosPessoais();

    System.out.println("\nDados da segunda pessoa:");
    pessoa2.imprimeDadosPessoais();

    scanner.close();
  }
}