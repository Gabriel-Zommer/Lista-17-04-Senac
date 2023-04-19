import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        Map<String, Integer> contadorPalavras = new HashMap<>();

        for (String palavra : palavras) {
            if (contadorPalavras.containsKey(palavra)) {
                contadorPalavras.put(palavra, contadorPalavras.get(palavra) + 1);
            } else {
                contadorPalavras.put(palavra, 1);
            }
        }

        System.out.println("Palavras que aparecem mais de uma vez:");
        for (Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " vezes");
            }
        }

        sc.close();
    }
}

