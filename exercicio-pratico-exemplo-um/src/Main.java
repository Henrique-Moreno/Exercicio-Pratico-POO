import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um scanner para entrada de dados

    // Criação do primeiro objeto DadosPessoais
    System.out.println("Digite os dados da primeira pessoa:");
    System.out.print("Nome: ");
    String nome1 = scanner.nextLine(); // Lê o nome da primeira pessoa

    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
    String[] data1 = scanner.nextLine().split("/");
    int dia1 = Integer.parseInt(data1[0]);
    int mes1 = Integer.parseInt(data1[1]);
    int ano1 = Integer.parseInt(data1[2]);

    Data dataNascimento1 = new Data(dia1, mes1, ano1); // Cria um objeto Data

    System.out.print("Idade: ");
    int idade1 = scanner.nextInt(); // Lê a idade da primeira pessoa
    scanner.nextLine(); // Limpa o  scanner

    DadosPessoais pessoa1 = new DadosPessoais(nome1, dataNascimento1, idade1); // Cria o primeiro objeto pessoa

    // Criação do segundo objeto
    System.out.println("\nDigite os dados da segunda pessoa:");
    System.out.print("Nome: ");
    String nome2 = scanner.nextLine();

    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
    String[] data2 = scanner.nextLine().split("/");
    int dia2 = Integer.parseInt(data2[0]);
    int mes2 = Integer.parseInt(data2[1]);
    int ano2 = Integer.parseInt(data2[2]);

    Data dataNascimento2 = new Data(dia2, mes2, ano2);

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