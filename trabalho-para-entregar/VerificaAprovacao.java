import java.util.Scanner;

public class VerificaAprovacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno APROVADO com média " + media);
        } else {
            System.out.println("Aluno REPROVADO com média " + media);
        }

        scanner.close();
    }
}
