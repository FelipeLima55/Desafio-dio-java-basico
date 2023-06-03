import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conta = obterConta(scanner);
        String agencia = obterAgencia(scanner);
        String nomeCliente = obterNome(scanner);
        double saldo = obterSaldo(scanner);

        scanner.close();

        System.out.println("Conta: " + conta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }

    public static int obterConta(Scanner scanner) {
        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();
        scanner.nextLine();
        return conta;
    }

    public static String obterAgencia(Scanner scanner) {
        System.out.println("Digite sua agência");
        String agencia = scanner.nextLine();
        return agencia;
    }

    public static String obterNome(Scanner scanner) {
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();
        return nome;
    }

    public static double obterSaldo(Scanner scanner) {
        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        return saldo;
    }
}
