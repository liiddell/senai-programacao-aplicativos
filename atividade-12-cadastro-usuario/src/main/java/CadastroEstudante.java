import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.List;

public class CadastroEstudante {
    private ArrayList<Estudante> estudantes = new ArrayList<>();

    public void adicionarEstudante(Estudante estudante){
            estudantes.add(estudante);
    }

    public ArrayList<Estudante> buscarPorNome(String nome){
        ArrayList<Estudante> buscaNome = new ArrayList<>();
        for (Estudante estudante : estudantes) {
            if (estudante.getNome().contains(nome)) {
                buscaNome.add(estudante);
            }
        }
        return buscaNome;
    }

    public void listarEstudantes() {
        for (Estudante estudante : estudantes) {
            System.out.printf(estudante.exibirInformacoes());
        }
    }

}
