import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        CadastroEstudante cadastro = new CadastroEstudante();

        Estudante a1 = new Estudante("José", 15);
        cadastro.adicionarEstudante(a1);

        Estudante a2 = new Estudante("Diogo", 18);
        cadastro.adicionarEstudante(a2);

        Estudante a4 = new Estudante("Diogo", 25);
        cadastro.adicionarEstudante(a4);

        Estudante a3 = new Estudante("Naara", 14);
        cadastro.adicionarEstudante(a3);

        System.out.printf("\nLista de estudantes:\n");
        cadastro.listarEstudantes();

        System.out.printf("------------------------");
        System.out.printf("\nBusca pelo nome:\n");
        for(Estudante estudante: cadastro.buscarPorNome("Diogo")){
            System.out.printf(estudante.exibirInformacoes());
        }

    }
}
