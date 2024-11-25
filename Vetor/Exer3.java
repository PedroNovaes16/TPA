import java.util.Scanner;
public class Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int i,ehPrimo,divisor;
       final int TAM = 10;
        int A[] = new int[10];
        
        System.out.println("Digite 10 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        System.out.println("\nResultados:");
        for ( i = 0; i < TAM; i++) {
            int numero = A[i];
             ehPrimo = 1; 
            
            if (numero <= 1) {
                ehPrimo = 0; 
            } else {
                 divisor = 2; 
                while (divisor < numero) { 
                    if (numero % divisor == 0) {
                        ehPrimo = 0;
                        } 
                        else {
                    }
                    divisor++;
                }
            }

            
            if (ehPrimo == 1) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
        ler.close();
    }
}

