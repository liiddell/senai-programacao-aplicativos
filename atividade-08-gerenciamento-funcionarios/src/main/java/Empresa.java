import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Gerente("João", 1800, "12345"));
        funcionarios.add(new Desenvolvedor("Maria", 1500));
        funcionarios.add(new Desenvolvedor("Jorge", 2000));
        funcionarios.add(new Gerente("Evelin", 1900, "34565"));


        Gerente gerente = (Gerente) funcionarios.get(0);

        for (Funcionario f : funcionarios) {
            f.exibirDados();

            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                if (((Gerente) f).autenticar("12345")) {
                    System.out.println("Acesso liberado.");
                } else {
                    System.out.println("Acesso negado!");
                }
            }
            System.out.println();
        }
    }
}