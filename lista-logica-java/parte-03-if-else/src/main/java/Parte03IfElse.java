import java.util.Scanner;

public class Parte03IfElse {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // exercicio25();
        // exercicio26();
        // exercicio27();
        // exercicio28();
        // exercicio29();
        // exercicio30();


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
}

