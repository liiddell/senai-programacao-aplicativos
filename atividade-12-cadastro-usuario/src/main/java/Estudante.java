public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private static int quantidadeEstudantes;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = "EST" + ++quantidadeEstudantes;
    }

    public String exibirInformacoes(){
        return String.format("""
                \nNome: %s
                Idade: %d
                Matricula: %s
                """, nome, idade, matricula);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }
}
