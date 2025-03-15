import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Qual é seu saldo?");
        double saldoInicial = scanner.nextDouble();

        // Entrada das transações
        System.out.println("Qual o valor do depósi100to?");
        double transacao1 = scanner.nextDouble();

        System.out.println("Qual o valor do saque?");
        double transacao2 = scanner.nextDouble();

        System.out.println("Qual o valor do saque?");
        double transacao3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + transacao1 - transacao2 - transacao3;

        // Exibir o saldo final formatado com duas casas decimais
        System.out.printf("Saldo final: %.2f\n", saldoFinal);

        scanner.close();
    }
}