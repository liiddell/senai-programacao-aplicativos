public class Capa {
    private String cor;
    private String material;
    private double valor;

    public Capa(){

    }

    public Capa(String cor, String material, double valor) {
        this.cor = cor;
        this.material = material;
        this.valor = valor;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
