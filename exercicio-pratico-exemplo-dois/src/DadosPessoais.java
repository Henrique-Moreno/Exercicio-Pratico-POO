public class DadosPessoais {
  // Atributos da classe
  private String nome;
  private String dataNascimento; // Data de nascimento em formato de String
  private int idade;

  // Construtor da classe
  public DadosPessoais(String nome, String dataNascimento, int idade) {
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

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
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
    System.out.println("Data de Nascimento: " + dataNascimento);
    System.out.println("Idade: " + idade);
  }
}