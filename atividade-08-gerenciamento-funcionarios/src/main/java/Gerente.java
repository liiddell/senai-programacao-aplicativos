public class Gerente extends Funcionario implements IAutenticavel {

    private String senha;

    public Gerente() {
    }

    public Gerente(String nome, double salarioBase, String senha) {
        super(nome, salarioBase);
        setSenha(senha);

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }

    @Override
    public boolean autenticar(String senha) {
        if (!senha.equals(this.senha)) {
            return false;
        }
        return true;
    }
}

