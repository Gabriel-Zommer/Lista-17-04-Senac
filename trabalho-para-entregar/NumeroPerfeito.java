import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int somaDivisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == n) {
            System.out.println(n + " é um número perfeito.");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }

        sc.close();
    }
}
