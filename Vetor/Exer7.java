import java.util.Scanner;
public class Exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int i,numero,fatorial,contador;
        int A[] = new int[TAM];
        int B[] = new int[TAM];

        
        System.out.println("Digite 15 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        
        for ( i = 0; i < TAM; i++) {
             numero = A[i];
             fatorial = 1;
             contador = 1;
            while (contador <= numero) {
                fatorial = fatorial * contador; 
                contador++; 
            }
            
            B[i] = fatorial; 
        }

        
        System.out.println("\nResultados:");
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + A[i] + " -> B[" + i + "] = " + B[i]);
        }

        ler.close();
    }
}

