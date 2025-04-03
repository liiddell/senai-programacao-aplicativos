public class Main {
    public static void main(String[] args) {
        Acessorio a1 = new Acessorio("Capacete", "BMX", "Plástico", 200.0);
        Bicicleta bicicleta1 = new Bicicleta("Onix", "Trip", "Road", 1500.0, a1);

        bicicleta1.exibirDetalhes();
        System.out.println();

        Acessorio a2 = new Acessorio("Farol", "Caloi", "Plástico", 75.0);
        Bicicleta bicicleta2 = new Bicicleta("Caloi", "Road", "Trip", 2500.0, a2);

        bicicleta2.exibirDetalhes();
        System.out.println();


        bicicleta1.aplicarDesconto(10);
        bicicleta2.aplicarDesconto(2);

        bicicleta1.exibirDetalhes();
        System.out.println();

        bicicleta2.exibirDetalhes();
        System.out.println();

        System.out.printf("O valor total com desconto da bicicleta %s %s com o %s de %s ficou de: R$ %.2f%n",
                bicicleta1.getMarca(), bicicleta1.getModelo(),
                bicicleta1.getAcessorio().getTipo(), bicicleta1.getAcessorio().getMaterial(),
                bicicleta1.calcularValorTotal());

        System.out.printf("O valor total com desconto da bicicleta %s %s com o %s de %s ficou de: R$ %.2f%n",
                bicicleta2.getMarca(), bicicleta2.getModelo(),
                bicicleta2.getAcessorio().getTipo(), bicicleta2.getAcessorio().getMaterial(),
                bicicleta2.calcularValorTotal());

    }
}

