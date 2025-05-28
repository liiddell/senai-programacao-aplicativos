import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CadastroEstudantesTest {

    private CadastroEstudante cadastro;

    @Before
    public void setUp() {
        cadastro = new CadastroEstudante();

        for (int i = 1; i <= 3; i++) {
            Estudante estudante = new Estudante("Estudante" + i, 20 + i);
            cadastro.adicionarEstudante(estudante);
        }
    }

    @Test
    public void BuscarPorNome() {
        ArrayList<Estudante> resultado = cadastro.buscarPorNome("Estudante1");

        assertEquals("Estudante1", resultado.get(0).getNome());
        assertEquals(21, resultado.get(0).getIdade());
    }

    @Test
    public void testListarEstudantes() {
        assertEquals(3, cadastro.buscarPorNome("Estudante").size());
    }
}

