public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidade;
    double velocidadeMaxima;
    boolean ligado;

    void ligar() {
        if (this.ligado) {
            System.out.println("Carro já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Carro ligado!");
        }
    }

    void desligar() {
        this.ligado = false;
        System.out.println("Carro está desligado!");

    }

    void acelerar() {
        if (this.ligado) {
            if (this.velocidade + 10 <= this.velocidadeMaxima) {
                this.velocidade += 10;
            } else {
                System.out.println("Velocidade máxima atingida!");
            }
        } else {
            System.out.println("Não é possível acelerar!");
        }
    }

    int verificarMarcha() {
        if (this.velocidade >= 0 && this.velocidade <= 20) {
            return 1;
        } else if (this.velocidade >= 21 && this.velocidade <= 40) {
            return 2;
        } else if (this.velocidade >= 41 && this.velocidade <= 70) {
            return 3;
        } else if (this.velocidade >= 71 && this.velocidade <= 100) {
            return 4;
        } else if (this.velocidade > 101) {
            return 5;
        }
        return 0;
    }


    String status() {
        return "Cor: " + this.cor + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nLigado: " + this.ligado
                + "\nVelocidade: " + this.velocidade + "\nVelocidade Máxima: " + this.velocidadeMaxima;
    }

}
