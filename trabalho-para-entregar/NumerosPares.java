import java.util.Scanner;

public class NumerosPares {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número: ");
      int num = sc.nextInt();
      System.out.println("Números pares até " + num + ": ");
      for (int i = 0; i <= num; i++) {
         if (i % 2 == 0) {
            System.out.print(i + " ");
         }
      }
      sc.close();
   }
}

