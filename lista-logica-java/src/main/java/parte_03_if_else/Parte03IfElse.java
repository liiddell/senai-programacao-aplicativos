package parte_03_if_else;

import java.util.Scanner;

public class Parte03IfElse {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void compararDoisNumeros() {
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os doi números são iguais!");
        }
    }

    public static void classificarNumeroEmFaixa() {
        int n;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        if (n <= 10) {
            System.out.println("F1");
        } else if (n > 10 && n <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }

    public static void calcularMediaComPesos() {
        double nota1, nota2, nota3;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        nota1 = (nota1 * 2);
        nota2 = (nota2 * 3);
        nota3 = (nota3 * 5);

        double mediaFinal = (nota1 + nota2 + nota3) / 10;

        System.out.printf("Sua média é de: %.2f\n", mediaFinal);

        if (mediaFinal >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

    public static void ordenarTresNumerosCrescente() {
        int a, b, c;

        System.out.println("Digite um número: ");
        a = scanner.nextInt();

        System.out.println("Digite um número: ");
        b = scanner.nextInt();

        System.out.println("Digite um número: ");
        c = scanner.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.printf("Ordem crescente: %d, %d, %d\n", a, b, c);

    }

    public static void avaliarAprovacaoCandidato() {

        String nome;
        double notaPt, notaMat, notaConG;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite a nota da prova de Português: ");
        notaPt = scanner.nextDouble();
        System.out.println("Digite a nota da prova de Matemática: ");
        notaMat = scanner.nextDouble();
        System.out.println("Digite a nota da prova de Conhecimentos Gerais: ");
        notaConG = scanner.nextDouble();

        double media = (notaPt + notaMat + notaConG) / 3.0;

        if (media >= 7.0 && notaPt >= 5.0 && notaMat >= 5.0 && notaConG >= 5.0) {
            System.out.println("Nome: " + nome + "\nSituação: Aprovado! \nMédia: " + media);
        } else {
            System.out.println("Nome: " + nome + "\nSituação: Reprovado! \nMédia: " + media);
        }
    }

    public static void calcularComissaoVendedores() {
        String nome;
        double valor, comissao, totalVendas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite o valor da venda: ");
            valor = scanner.nextDouble();
            scanner.nextLine();

            if (valor > 50000.0) {
                comissao = valor * 0.12;
            } else if (valor >= 30000.0 && valor <= 50000.0) {
                comissao = valor * 0.095;
            } else {
                comissao = valor * 0.07;
            }

            totalVendas += valor;

            System.out.printf("\nCorretor: %s\n", nome);
            System.out.printf("Valor da Venda: R$ %.2f\n", valor);
            System.out.printf("Comissão: R$ %.2f\n\n", comissao);
        }

        System.out.printf("Total de vendas da empresa: R$ %.2f\n", totalVendas);

    }

    public static void compararSoma() {
        int a, b, c;

        System.out.println("Digite o número A: ");
        a = scanner.nextInt();

        System.out.println("Digite o número B: ");
        b = scanner.nextInt();

        System.out.println("Digite o número C: ");
        c = scanner.nextInt();

        int soma = a + b;

        if (soma > c) {
            System.out.println("A soma de A + B é maior que C!");
        } else if (soma < c) {
            System.out.println("A soma de A + B é menor que C!");
        } else {
            System.out.println("A soma é de A + B é igual a C!");
        }
    }

    public static void calculcarValorCompra() {
        double valorCompra, valorPago;

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();
        System.out.println("Digite o valor pago: ");
        valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor pago insuficiente!");
        }

        double troco = valorPago - valorCompra;
        double nota100 = 0.0;
        double nota10 = 0.0;
        double nota1 = 0.0;

        if (troco >= 100) {
            nota100 = troco / 100;
            troco = troco % 100;
        }
        if (troco >= 10) {
            nota10 = troco / 10;
            troco = troco % 10;
        }
        if (troco >= 1) {
            nota1 = troco;
        }

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do troco: R$ " + (valorPago - valorCompra));
        System.out.println("Notas de R$100: R$ " + nota100);
        System.out.println("Notas de R$10: R$ " + nota10);
        System.out.println("Notas de R$10: R$ " + nota1);
    }

    public static void calcularCompracomDesconto() {
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Quantidade parafusos: ");
        int qtdParafusos = scanner.nextInt();
        System.out.println("Quantidade porcas: ");
        int qtdPorca = scanner.nextInt();
        System.out.println("Quantidade arruelas: ");
        int qtdArruela = scanner.nextInt();

        double precoParafuro = 2.50;
        double precoPorca = 1.00;
        double precoArruela = 0.50;

        double totalParafuso = qtdParafusos * precoParafuro;
        double totalPorca = qtdPorca * precoPorca;
        double totalArruela = qtdArruela * precoArruela;

        double descontoParafuso = 0;
        double descontoPorca = 0;
        double descontoArruela = 0;

        if (qtdParafusos > 0) {
            descontoParafuso = totalParafuso * 0.20;
        }
        if (qtdPorca > 0) {
            descontoPorca = totalPorca * 0.10;
        }

        if (qtdArruela > 0) {
            descontoArruela = totalArruela * 0.30;
        }

        double totalDesconto = descontoParafuso + descontoPorca + descontoArruela;
        double totalCompra = (totalParafuso + totalPorca + totalArruela) - totalDesconto;

        System.out.println("\n--- RESUMO DA COMPRA ---");
        System.out.println("Cliente: " + nome);
        System.out.println("Parafusos: " + qtdParafusos + " unidades");
        System.out.println("Porcas: " + qtdPorca + " unidades");
        System.out.println("Arruelas: " + qtdArruela + " unidades");
        System.out.println("Total de desconto: R$ " + totalDesconto);
        System.out.println("Total a pagar: R$ " + totalCompra);
    }

    public static void calcularSalarioPicaPau() {
        double salarioMinimo;
        int qtdCarros;
        double totalVendas;

        System.out.print("Informe o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();

        System.out.print("Quantos carros você vendeu? ");
        qtdCarros = scanner.nextInt();

        System.out.print("Qual o valor total das vendas? ");
        totalVendas = scanner.nextDouble();

        double salarioFixo = salarioMinimo * 2;
        double comissaoPorCarro = qtdCarros * 50.0;
        double comissaoPorVendas = totalVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        System.out.printf("Seu salário final é: R$ %.2f%n", salarioFinal);
    }

    public static void imprimirArtigos() {
        String[] nome = new String[4];
        double[] preco = new double[4];
        double[] desconto = new double[4];
        double[] precoDesconto = new double[4];
        double totalPagar = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Artigo " + (i+1) + " : ");
            System.out.println("Digite o nome do artigo: ");
            nome[i] = scanner.nextLine();
            System.out.println("Digite o preço do artigo: ");
            preco[i] = scanner.nextDouble();
            System.out.println("Percentual de desconto (%): ");
            desconto[i] = scanner.nextDouble();

            scanner.nextLine();

            if (desconto[i] < 0 || desconto[i] > 100) {
                throw new IllegalArgumentException("Desconto inválido, será considerado 0%");
            } else {
                System.out.println("Desconto válido.");
            }

            precoDesconto[i] = preco[i] * (1 - desconto[i] / 100);

            totalPagar += precoDesconto[i];
        }

        System.out.println("=================== Compras ==================");
        for (int i = 0; i < 4; i++){
            System.out.println("Artigos: " +nome[i]);
            System.out.printf("Preço original: R$ %.2f%n", preco[i]);
            System.out.printf("Desconto: %.1f%%%n", desconto[i]);
            System.out.printf("Preço com desconto: R$ %.2f%n", precoDesconto[i]);
            System.out.println("-----------------------------------------------");
        }

        System.out.printf("Total compra:R$ %.2f%n", totalPagar);
    }

    public static void sorveteria(){
        double picole_tipo1 = 0.50;
        double picole_tipo2 = 0.60;
        double picole_tipo3 = 0.75;
        int qtdTipo1, qtdTipo2, qtdTipo3;

        System.out.print("Quantidade vendida do picolé tipo 1: ");
        qtdTipo1 = scanner.nextInt();
        System.out.print("Quantidade vendida do picolé tipo 2: ");
        qtdTipo2 = scanner.nextInt();
        System.out.print("Quantidade vendida do picolé tipo 3: ");
        qtdTipo3 = scanner.nextInt();

        if(qtdTipo1 < 0 && qtdTipo2 < 0  && qtdTipo3 <0){
            throw new IllegalArgumentException("Erro, valor abaixo de 0");
        }

        double totalTipo1 = qtdTipo1 * picole_tipo1;
        double totalTipo2 = qtdTipo2 * picole_tipo2;
        double totalTipo3 = qtdTipo3 * picole_tipo3;

        double totalArrecadado = totalTipo1 + totalTipo2 + totalTipo3;

        System.out.println("\nRelatório de Vendas:");
        System.out.println("----------------------------------");
        System.out.printf("Picolé Tipo 1: %d unidades - R$ %.2f%n", qtdTipo1, totalTipo1);
        System.out.printf("Picolé Tipo 2: %d unidades - R$ %.2f%n", qtdTipo2, totalTipo2);
        System.out.printf("Picolé Tipo 3: %d unidades - R$ %.2f%n", qtdTipo3, totalTipo3);
        System.out.println("----------------------------------");
        System.out.printf("Total Arrecadado: R$ %.2f%n", totalArrecadado);
    }

    public static void contaBancaria(){
        System.out.println("=================== Conta Bancária ====================");

        int numConta, tipoOperacao;
        double saldo, valorOperacao;

        System.out.println("Digite o número da conta: ");
        numConta = scanner.nextInt();

        System.out.println("Saldo atual: R$ ");
        saldo = scanner.nextDouble();

        System.out.println("Tipo de operação: \n1 - Depósito \n2 - Saque");
        tipoOperacao = scanner.nextInt();

        System.out.println("Valor da operação: R$");
        valorOperacao = scanner.nextDouble();

        if(tipoOperacao == 1){
            saldo+=valorOperacao;
        }else if(tipoOperacao == 2){
            saldo-=valorOperacao;
        }
        else{
            System.out.println("Operação invalida!");
        }

        System.out.println("====================Extrato====================");
        System.out.println("Número da conta: " +numConta);
        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);

        if(saldo < 0){
            System.out.println("Conta estourada!");
        }

    }
}


