import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem-vindo ao Rbank!");

        System.out.print("Digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.print("Agora digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Diga seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Quanto deseja depositar? ");
        double valorDeposito = scanner.nextDouble();

        System.out.println("\n---------------------------------");
        System.out.println("Olá, " + nomeCliente + "!");
        System.out.println("Seu depósito foi realizado com sucesso.");
        System.out.println("Detalhes da conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Valor depositado: R$ %.2f%n", valorDeposito);
        System.out.println("---------------------------------");

        scanner.close();
    }
}

