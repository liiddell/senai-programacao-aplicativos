import java.util.Scanner;

public class ExerciciosParte02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // exercicio04();
        // exercicio05();
        // exercicio06();
        // exercicio07();
        // exercicio08();
        // exercicio09();
        // exercicio10();
        // exercicio11();
        // exercicio12();
        // exercicio13();
        // exercicio14();
        // exercicio15();
    }

    static void exercicio04() {
        int raio;
        double area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = scanner.nextInt();

        area = pi * Math.pow(raio, 2);

        System.out.println("O valor da área é de: " + area + " metros");
    }

    static void exercicio05() {
        double area, base, altura;

        System.out.println("Digite a base da triangulo: ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura da triangulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);

    }

    static void exercicio06() {
        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    static void exercicio07() {
        int num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println("A soma do número " + num1 + " e número " + num2 + " é de: " + soma);
    }

    static void exercicio08(){
        int ht;
        double vh;
        double pd;

        System.out.println("Digite as horas trabalhadas: ");
        ht = scanner.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        vh = scanner.nextDouble();
        System.out.println("Digite o percentual de desconto: ");
        pd = scanner.nextDouble();

        double salarioBruto;
        double totalDesconto;
        double salarioLiquido;

        salarioBruto = ht * vh;
        totalDesconto = (pd / 100) * salarioBruto;
        salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Horas trabalhadas: " +ht);
        System.out.println("Salário bruto: " +salarioBruto);
        System.out.println("Desconto: " +totalDesconto);
        System.out.println("Salário líquido: "+salarioLiquido);

    }

    static void exercicio09(){
        int celsius;

        System.out.println("=====Conversor de Temperatura=====");
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scanner.nextInt();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " +fahrenheit+ "°");

    }

    static void exercicio10(){
        int fahrenheit;

        System.out.println("=====Conversor de Temperatura=====");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        double celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.printf("A temperatura em Celsius é: %.2f°\n", celsius);

    }

    static void exercicio11(){
        double raio;
        double altura;
        double pi = 3.14159;

        System.out.println("Digite a o raio da lata: ");
        raio = scanner.nextDouble();

        System.out.println("Digite a altura da lata: ");
        altura = scanner.nextDouble();

        double volume = pi * Math.pow(raio,2) * altura;

        System.out.printf("O volume dessa lata é de: %.2f\n", volume);

    }

    static void exercicio12(){

        double tempoGasto, velocidade;

        System.out.println("Digite o tempo gasto: ");
        tempoGasto = scanner.nextDouble();
        System.out.println("Digite a velocidade média de viagem: ");
        velocidade = scanner.nextDouble();

        double distancia = tempoGasto * velocidade;
        double consumoGasolina = distancia / 12;

        System.out.printf("Velocidade média: %.2f Km", velocidade);
        System.out.printf("\nTempo gasto: %.2f horas", tempoGasto);
        System.out.printf("\nDistância percorrida: %.2f Km", distancia);
        System.out.printf("\nConsumo de combustível: %.2f litros.", consumoGasolina);

    }

    static void exercicio13(){
        int a,b, temp;

        System.out.println("Digite valor A: ");
        a = scanner.nextInt();
        System.out.println("Digite valor B: ");
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A: " +a);
        System.out.println("B: " +b);
    }

    static void exercicio14() {
        int a, b, c, d;

        System.out.println("====Propriedade distributiva====");
        System.out.println("Digite o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        c = scanner.nextInt();
        System.out.println("Digite o valor de D: ");
        d = scanner.nextInt();

        System.out.println("A+B: " + (a + b));
        System.out.println("A+C: " + (a + c));
        System.out.println("A+D: " + (a + d));
        System.out.println("B+C: " + (b + c));
        System.out.println("B+D: " + (b + d));
        System.out.println("C+D: " + (c + d));
        System.out.println();
        System.out.println("A*B: " + (a * b));
        System.out.println("A*C: " + (a * c));
        System.out.println("A*D: " + (a * d));
        System.out.println("B*C: " + (b * c));
        System.out.println("B*D: " + (b * d));
        System.out.println("C*D: " + (c * d));

    }

    static void exercicio15(){
        double comprimento, largura, altura;

        System.out.println("====Volume de uma caixa retangular====");
        System.out.println("Digite o comprimento: ");
        comprimento = scanner.nextDouble();
        System.out.println("Digite a largura: ");
        largura = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("Volume da caixa retangular: %.2f unidades cubicas", volume);
    }

}



