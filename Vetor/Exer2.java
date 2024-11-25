import java.util.Scanner;
public class Exer2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		final int TAM = 5;
        int A[] = new int[TAM];

       
        System.out.println("Digite 5 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        
        System.out.println("\nTabuadas:");
        for ( i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do número " + A[i] + ":");
  
            int multiplicador = 1;  
            while (multiplicador <= 10) {  
                int resultado = A[i] * multiplicador;
                System.out.println(A[i] + " x " + multiplicador + " = " + resultado);
                multiplicador++;  
            }
        }

        ler.close();
    }
}
