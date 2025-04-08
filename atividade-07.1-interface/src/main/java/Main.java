public class Main {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Rua do bobo", 100_000);
        Velho imovelVelho = new Velho("Rua do bobo", 100_000);

        imovelNovo.mostrarValor();
        imovelVelho.mostrarValor();
    }
}
