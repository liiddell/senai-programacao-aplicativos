public class Velho extends Imovel {
    public Velho(){

    }

    public Velho(String endereco, double preco){
        super(endereco, preco);
    }

    @Override
    public double calcularValor(){
       return this.getPreco() * 0.85;
    }

    @Override
    public void mostrarValor(){
        System.out.println("Valor do imóvel: R$ " +calcularValor());
    }
}
