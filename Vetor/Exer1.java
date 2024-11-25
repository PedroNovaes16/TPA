import java.util.Scanner;
public class Exer1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,indicePar = 0,indiceImpar = 19;
        final int TAM = 20;
        int A[] = new int[TAM];
        
        int B[] = new int[TAM];

        System.out.println("Digite 20 elementos para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        for ( i = 0; i < TAM; i++) {
            int elemento = A[i];
            if (elemento % 2 == 0) {  
                B[indicePar] = elemento;
                indicePar++;
            } else {  
                B[indiceImpar] = elemento;
                indiceImpar--;
            }
        }
        System.out.println("\nVetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\n\nVetor B:");
        for ( i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
        
        ler.close();
    }
}
