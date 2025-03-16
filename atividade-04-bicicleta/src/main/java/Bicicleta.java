public class Bicicleta {
    private String marca;
    private String modelo;
    private String tipo;
    private double valor;
    private Acessorio acessorio;

    public Bicicleta(String marca, String modelo, String tipo, double valor, Acessorio acessorio) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setValor(valor);
        setAcessorio(acessorio);
    }

    public Bicicleta(){

    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        this.valor = valor;
    }

    public Acessorio getAcessorio(){
        return this.acessorio;
    }
    public void setAcessorio(Acessorio acessorio){
        this.acessorio = acessorio;
    }

    public double calcularValorTotal(){
        return this.valor + this.acessorio.getPreco();
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem < 0 || porcentagem > 100){
            System.out.println("O desconto deve estar entre 0% e 100%");
        }
                //this.valor *= (1 - porcentagem / 100); // 1- 0.1 /100 = 0.9
        double desconto = this.valor * porcentagem / 100;
        this.valor -= desconto;
    }

    public void exibirDetalhes() {
        System.out.println("Bicicleta: " + this.marca + " " + this.modelo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Valor da bicicleta: R$ " + this.valor);
        System.out.println("Acessório: " + this.acessorio.getTipo() + " - " + this.acessorio.getMarca());
        System.out.println("Material do acessório: " + this.acessorio.getMaterial());
        System.out.println("Preço do acessório: R$ " + this.acessorio.getPreco());
        System.out.println("Valor total: R$ " + calcularValorTotal());
    }


}



