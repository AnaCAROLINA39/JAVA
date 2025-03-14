import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // entrada de dados pelo terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor,digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite sua Agência !");
        String agencia = scanner.next();

        System.out.println("Digite sua Saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        
// nao sei se o saldo e adiciopnando pelo usuario ou se e um valor fixo

    }
}
