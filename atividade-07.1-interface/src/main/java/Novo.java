public class Novo extends Imovel {

    public Novo(){

    }
    public Novo(String endereco, double preco){
        super(endereco, preco);
    }

    @Override
    public double calcularValor(){
        return this.getPreco() * 1.3;
    }

    @Override
    public void mostrarValor(){
        System.out.println("Valor do imóvel: R$ " +calcularValor());
    }
}
