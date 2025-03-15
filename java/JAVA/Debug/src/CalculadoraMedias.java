import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] alunos = { "camila", "lucas", "nadia", "ana" };

        

        double media = calculadoradaTurma(alunos, scan);

        System.out.printf("media da turma %.1f", media);
    }

    public static double calculadoradaTurma(String[] alunos, Scanner scanner) {

        double soma = 0.0;

        for (String aluno : alunos) {
            System.out.printf("nota da aluno %s:", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
