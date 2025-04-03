public class Main {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca("155545", "2",20.0);
        ContaCorrente c2 = new ContaCorrente("254515", "2", 30.0);

        c1.depositar(20.0);
        c1.obterValor();
        c1.sacar(100);
        c1.obterValor();
        c1.sacar(20.0);
        c1.obterValor();

        System.out.println();

        c2.obterValor();
        c2.depositar(50.0);
        c2.obterValor();
        c2.sacar(100);
        c2.obterValor();
        c2.sacar(20.0);
        c2.obterValor();


    }
}
