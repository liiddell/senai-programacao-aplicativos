import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();  // Criando a instância da TV

        int opcao;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Ligar TV");
            System.out.println("2 - Desligar TV");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Trocar Canal");
            System.out.println("6 - Mudo");
            System.out.println("7 - Status");
            System.out.println("0 - Sair...");
            System.out.print("Selecione uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tv.ligar();
                    break;
                case 2:
                    tv.desligar();
                    break;
                case 3:
                    tv.aumentarVolume();
                    break;
                case 4:
                    tv.diminuirVolume();
                    break;
                case 5:
                    System.out.print("Digite o canal desejado: ");
                    int canal = scanner.nextInt();
                    tv.trocarCanal(canal);
                    break;
                case 6:
                    tv.mudo();
                    break;
                case 7:
                    System.out.println(tv.status());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
