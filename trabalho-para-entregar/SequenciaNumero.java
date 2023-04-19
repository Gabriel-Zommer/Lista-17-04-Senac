import java.util.Scanner;

public class SequenciaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
