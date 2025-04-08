public abstract class Imovel implements iCalcularValor{
    private String endereco;
    private double preco;


    public Imovel(){

    }

    public Imovel(String endereco, double preco){
        setEndereco(endereco);
        setPreco(preco);
    }

    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
