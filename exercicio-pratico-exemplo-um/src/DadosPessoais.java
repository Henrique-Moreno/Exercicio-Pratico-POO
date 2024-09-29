public class DadosPessoais {
  private String nome;
  private Data dataNascimento; // Atributo do tipo Data
  private int idade;

  // Construtor da classe DadosPessoais
  public DadosPessoais(String nome, Data dataNascimento, int idade) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.idade = idade;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Data getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Data dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  // Método para imprimir os dados pessoais
  public void imprimeDadosPessoais() {
    System.out.println("Nome: " + nome);
    System.out.print("Data de Nascimento: ");
    dataNascimento.imprimirData(); // Chama o método da classe Data
    System.out.println("Idade: " + idade);
  }
}
