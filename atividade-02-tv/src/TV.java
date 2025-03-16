public class TV {

    String marca;
    int volume = 20;
    int volumeMaximo = 100;
    int volumeMinimo = 0;
    int canalAtual = 1;
    boolean ligado;

    void ligar() {
        if (this.ligado) {
            System.out.println("a TV já está ligada!");
        } else {
            this.ligado = true;
            System.out.println("TV ligado!");
        }
    }

    void desligar() {
        this.ligado = false;
        System.out.println("TV desligada!");

    }

    void aumentarVolume() {
        if (!this.ligado) {
            System.out.println("TV desligada");
        } else if (this.volume >= volumeMaximo) {
            System.out.println("Volume máximo atingido");
        } else {
            this.volume++;
            System.out.println("Volume: " + this.volume);
        }
    }

    void diminuirVolume() {
        if (!this.ligado) {
            System.out.println("TV desligada");
        } else if (this.volume <= volumeMinimo) {
            System.out.println("Mudo, aumente o volume!");
        } else {
            this.volume--;
            System.out.println("Volume: " + this.volume);
        }
    }

    void trocarCanal(int novoCanal) {
        if (!this.ligado) {
            System.out.println("TV desligada");

        } else if (novoCanal < 1 || novoCanal > 999) {
            System.out.println("Número do canal inválido");
        } else {
            this.canalAtual = novoCanal;
            System.out.println("Canal atual: " + this.canalAtual);
        }
    }

    String status() {
        if (!this.ligado) {
            return "TV desligada";
        }
        return String.format("TV ligada! \nCanal: %d \nVolume: %d", this.canalAtual, this.volume);
        //return "TV ligada! \nCanal: " + this.canalAtual + "\nVolume: " + this.volume;
    }

    void mudo() {
        if (!this.ligado) {
            System.out.println("TV desligada");
            return;
        }
        this.volume = volumeMinimo;
        System.out.println("TV no mudo");
    }
}

