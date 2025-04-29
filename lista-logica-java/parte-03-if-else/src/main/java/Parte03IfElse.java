import java.util.Scanner;

public class Parte03IfElse {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // exercicio25();
        // exercicio26();
        // exercicio27();
        // exercicio28();
        // exercicio29();
        exercicio30();


    }

    static void exercicio25() {
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

    static void exercicio26() {
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

    static void exercicio27() {
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

    static void exercicio28() {
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

    static void exercicio29() {

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

    static void exercicio30() {
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
            }
            else if (valor >= 30000.0 && valor <= 50000.0) {
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
}

