public class Retangulo extends Forma{
    private double largura, altura;

    public Retangulo(String cor) {
        super(cor);
        this.largura = 1;
        this.altura = 1;
    }

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.round(largura * altura * 100) / 100.0;
    }

    @Override
    public double calcularPerimetro() {
        return Math.round(2 * (largura + altura) * 100) / 100.0;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
