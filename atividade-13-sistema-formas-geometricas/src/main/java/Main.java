import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        Circulo circulo = new Circulo("Azul", 3.0);
        formas.add(circulo);
        formas.add(new Retangulo("Vermelho", 6.0, 4.0));
        formas.add(new Retangulo("Verde"));

        for (Forma forma: formas){
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Cor: " + forma.getCor());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("------------------------");
        }

        circulo.redimensionar(2.0);
        System.out.println("Após redimensionar o círculo:");
        System.out.println("Novo Raio: " + circulo.getRaio());
        System.out.println("Nova Área: " + circulo.calcularArea());
        System.out.println("Novo Perímetro: " + circulo.calcularPerimetro());

    }
}
