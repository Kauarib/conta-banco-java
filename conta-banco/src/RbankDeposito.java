import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class RbankDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            try {
                System.out.println("\nOlá, bem-vindo ao Rbank!");

                System.out.print("Digite o número da sua Agência: ");
                String agencia = scanner.next();

                System.out.print("Agora digite o número da sua conta: ");
                int numeroConta = scanner.nextInt();

                scanner.nextLine(); // Consumir quebra de linha pendente

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

                scanner.nextLine(); // **LIMPAR O BUFFER ANTES DA PRÓXIMA LEITURA**

                System.out.println("\nDeseja efetuar um novo depósito? (Sim ou Não)");
                String novoDeposito = scanner.nextLine().trim(); // Capturar a linha toda

                System.out.println("Você digitou: \"" + novoDeposito + "\""); // Depuração

                if (novoDeposito.equalsIgnoreCase("Nao")) {
                    System.out.println("Obrigado e volte sempre!");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: os campos conta e depósito devem ser valores numéricos.");
                scanner.nextLine(); // Limpar o buffer do Scanner
            }
        }

        scanner.close();
    }
}
