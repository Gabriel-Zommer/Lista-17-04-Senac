import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int fib1 = 0;
        int fib2 = 1;
        int fibAtual = 0;

        System.out.print("Sequência de Fibonacci até " + n + ": ");

        while (fibAtual <= n) {
            System.out.print(fibAtual + " ");

            fib1 = fib2;
            fib2 = fibAtual;
            fibAtual = fib1 + fib2;
        }

        scanner.close();
    }
}
