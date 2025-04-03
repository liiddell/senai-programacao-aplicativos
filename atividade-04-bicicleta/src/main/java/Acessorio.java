import java.util.ArrayList;

public class Acessorio {
    private String tipo;
    private String marca;
    private String material;
    private double preco;

    ArrayList<String> acessorios = new ArrayList<>();


    public Acessorio(){
    }

    public Acessorio(String tipo, String marca, String material, double preco) {
        setTipo(tipo);
        setMarca(marca);
        setMaterial(material);
        setPreco(preco);

        acessorios.add("Capacete");
        acessorios.add("Farol");
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        this.preco = preco;
    }
}
