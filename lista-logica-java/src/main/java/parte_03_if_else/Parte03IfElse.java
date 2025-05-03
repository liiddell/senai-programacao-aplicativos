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

    public static void calcularCompracomDesconto(){
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

        if(qtdParafusos > 0){
            descontoParafuso = totalParafuso * 0.20;
        }
        if (qtdPorca > 0){
             descontoPorca = totalPorca * 0.10;
        }

        if (qtdArruela > 0){
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
}

