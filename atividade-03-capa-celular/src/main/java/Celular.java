public class Celular {
    private String marca;
    private String cor;
    private String modelo;
    private double valor;
    private Capa capa;

    public Celular(){

    }

    public Celular(String marca, String cor, String modelo, double valor, Capa capa) {
        setMarca(marca);
        setCor(cor);
        setModelo(modelo);
        setValor(valor);
        setCapa(capa);
    }

    public String calcularTotal(){
        double total = this.valor + this.capa.getValor();
        return String.format(
                "\nO valor total do celular %s, com a capa %s de ficou de R$: %s",
                this.marca, this.capa.getCor(), total);
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

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Capa getCapa() {
        return this.capa;
    }
    public void setCapa(Capa capa) {
        this.capa = capa;
    }

}