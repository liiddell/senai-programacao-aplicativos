package parte_02_logica;

import java.util.Scanner;

public class Parte02Logica {
    static Scanner scanner = new Scanner(System.in);

    public static void calcularAreaCirculo() {
        int raio;
        double area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = scanner.nextInt();

        area = pi * Math.pow(raio, 2);

        System.out.println("O valor da área é de: " + area + " metros");
    }

    public static void calcularAreaTriangulo() {
        double area, base, altura;

        System.out.println("Digite a base da triangulo: ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura da triangulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);

    }

    public static void exibirNomeCompleto() {
        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    public static void somarDoisNumeros() {
        int num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println("A soma do número " + num1 + " e número " + num2 + " é de: " + soma);
    }

    public static void calcularSalarioLiquido (){
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

    public static void converterCelsiusParaFahrenheit (){
        int celsius;

        System.out.println("=====Conversor de Temperatura=====");
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scanner.nextInt();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " +fahrenheit+ "°");

    }

    public static void converterFahrenheitParaCelsius (){
        int fahrenheit;

        System.out.println("=====Conversor de Temperatura=====");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        double celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.printf("A temperatura em Celsius é: %.2f°\n", celsius);

    }

    public static void calcularVolumeLata (){
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

    public static void calcularConsumoCombustivel (){

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

    public static void trocarValores(){
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

    public static void calcularSomasEProdutos () {
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

    public static void calcularVolumeCaixa (){
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

    public static void calcularQuadradoECubo(){
        int valor;
        System.out.println("Digite um valor: ");
        valor = scanner.nextInt();

        int quadrado = valor * valor;
        int cubo = valor * valor * valor;

        System.out.println("O valor ao quadrado é de: " +quadrado);
        System.out.println("O valor ao cubo é de: "+cubo);
    }

    public static void calcularQuadradoDaSoma(){
        int num1, num2;

        System.out.println("Digite um valor A: ");
        num1 = scanner.nextInt();
        System.out.println("Digite um valor B: ");
        num2 = scanner.nextInt();

        int soma = num1 + num2;
        int quadrado = soma * soma;
        System.out.println("O quadrado da soma dos valores lido é de: " +quadrado);
    }

    public static void somarQuadrados(){
        int num1, num2;

        System.out.println("Digite um valor A: ");
        num1 = scanner.nextInt();
        System.out.println("Digite um valor B: ");
        num2 = scanner.nextInt();

        int quadradoA = num1 * num1;
        int quadradoB = num2 * num2;

        int somaQuadrado = quadradoA + quadradoB;

        System.out.println("A ao quadrado: " +quadradoA);
        System.out.println("B ao quadrado: " +quadradoB);
        System.out.println("A soma do quadrado de cada valor lido é:  " +somaQuadrado);
    }

    public static void calcularMedia(){
        int val1, val2;
        System.out.println("Digite o primeiro valor: ");
        val1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        val2 = scanner.nextInt();

        int media = (val1 + val2) / 2;

        System.out.println("A média dos valores digitados é de: "+ media);
    }

    public static void inverterValores(){
        int numA, numB;

        System.out.println("Digite o primeiro valor: ");
        numA = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        numB = scanner.nextInt();

        System.out.println("Valores em ordem inversa: "+numB+ " " +numA);

    }

    public static void converterKmHParaMS(){
        double velKh;
        System.out.println("Digite o a velocidade: ");
        velKh = scanner.nextDouble();

        double velMs = velKh / 3.6;

        System.out.printf("A velocidade %.2f Km/h é de: %.2fm/s.", velKh, velMs);
    }

    public static void calcularQuocienteEResto() {
        System.out.println("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = scanner.nextInt();

        int quociente = num1 / num2;
        int mod = num1 % num2;

        System.out.printf("Quociente: %d\nResto: %d\n", quociente, mod);
    }

    public static void calcularSalarioComDescontos(){
        double salario;

        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();

        double descontoPrevidencia = salario * 0.10;

        double descontoImposto = salario * 0.05;

        double salarioLiquido = salario - descontoPrevidencia - descontoImposto;

        System.out.printf("Seu salário final é de: R$%.2f", salarioLiquido);
    }

    public static void calcularDigitoVerificador() {
        int codigo;
        System.out.println("Digite um código de 5 dígitos: ");
        codigo = scanner.nextInt();

        int A = codigo / 10000;
        int B = (codigo / 1000) % 10;
        int C = (codigo / 100) % 10;
        int D = (codigo / 10) % 10;
        int E = codigo % 10;

        int S = 6*A + 5*B + 4*C + 3*D + 2*E;
        int digitoV = S % 7;

        System.out.printf("O dígito verificador do código %d é: %d\n", codigo, digitoV);
    }
}



