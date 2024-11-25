import java.util.Scanner;
public class Exer8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i,j,somatorio;
        final int TAM = 10;
        int A[] = new int[TAM];
        int B[] = new int[TAM];

        
        System.out.println("Digite 10 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        
        for ( i = 0; i < TAM; i++) {
             somatorio = 0;
             j = i;
            while (j < TAM) {
                somatorio += A[j];  
                j++;  
            }

            B[i] = somatorio;  
        }

        
        System.out.println("\nVetor A e Somatório no Vetor B:");
        for ( i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + A[i] + " -> B[" + i + "] = " + B[i]);
        }

        ler.close();
    }
}