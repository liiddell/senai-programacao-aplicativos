public abstract class Forma {
    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getCor() {
        return cor;
    }
}
