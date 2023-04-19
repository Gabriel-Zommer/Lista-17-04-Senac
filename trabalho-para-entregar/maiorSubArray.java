import java.util.Arrays;

public class maiorSubArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 2, 1, 5, 6}; 
        int[] subarrayAtual = {numeros[0]}; 
        int[] subarrayMaior = {}; 
        for (int i = 1; i < numeros.length; i++) {
            int numeroAtual = numeros[i];
            int ultimoElementoSubarrayAtual = subarrayAtual[subarrayAtual.length - 1];
            if (numeroAtual >= ultimoElementoSubarrayAtual) {
               
                int[] novoSubarrayAtual = Arrays.copyOf(subarrayAtual, subarrayAtual.length + 1);
                novoSubarrayAtual[subarrayAtual.length] = numeroAtual;
                subarrayAtual = novoSubarrayAtual;
            } else {
                
                if (subarrayAtual.length > subarrayMaior.length) {
                    subarrayMaior = subarrayAtual;
                }
                subarrayAtual = new int[] {numeroAtual};
            }
        }
        
        if (subarrayAtual.length > subarrayMaior.length) {
            subarrayMaior = subarrayAtual;
        }
        System.out.println("Maior subarray não decrescente: " + Arrays.toString(subarrayMaior));
    }
}
