import java.util.Scanner;

public class PessoaMaisNova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisNova) {
                nomeMaisNovo = nome;
                idadeMaisNova = idade;
            }
        }

        System.out.println("A pessoa mais nova é " + nomeMaisNovo);
        scanner.close();
    }
}

