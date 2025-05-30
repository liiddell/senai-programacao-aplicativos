public class Circulo extends Forma implements IRedimensionavel{
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.round(Math.PI * raio * raio * 100) / 100.0;
    }

    @Override
    public double calcularPerimetro() {
        return Math.round(2 * Math.PI * raio * raio * 100) / 100.0;
    }

    @Override
    public void redimensionar(double fator) {
        this.raio = fator;
    }

    public double getRaio() {
        return raio;
    }

}
