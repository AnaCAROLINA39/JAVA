import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);
        // System.out.println("ola, me chamo " + nome + " " + sobrenome);
        // System.out.println("tenho " + idade + " anos");
        // System.out.println("Minha Altura e " + altura + "cm");
   

        //entrada de dados pelo terminal
   Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
   System.out.println("Digite seu nome");
   String nome = scanner.next();

   System.out.println("Digite seu Sobrenome");
   String sobrenome = scanner.next();

   System.out.println("Digite sua idade");
   int idade = scanner.nextInt();

   System.out.println("Digite sua Altura");
   double altura = scanner.nextDouble();

        System.out.println("ola, me chamo " + nome + " " + sobrenome);
         System.out.println("tenho " + idade + " anos");
         System.out.println("Minha Altura e " + altura + "cm");
   
    }
    
}
