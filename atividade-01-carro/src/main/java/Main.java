public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Azul";
        carro1.ligado = true;
        carro1.marca = "Fiat";
        carro1.modelo = "Uno Mille";
        carro1.velocidade = 50;
        carro1.velocidadeMaxima = 120;
        System.out.println(carro1.status());
        System.out.println("=============================");
        carro1.acelerar();
        System.out.println("Marcha atual: " +carro1.verificarMarcha()+"\nVelocidade: "+carro1.velocidade);
        carro1.acelerar();
        System.out.println("Marcha atual: " +carro1.verificarMarcha()+ "\nVelocidade: "+carro1.velocidade);

    }
}
