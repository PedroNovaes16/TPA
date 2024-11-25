package listavetor;

import java.util.Scanner;

public class diferenca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM]; 
        int posicaoC = 0;
        
        System.out.println("Digite os 10 números para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }
        
        System.out.println("\nDigite os 10 números para o vetor B:");
        for (int j = 0; j < TAM; j++) {
            System.out.print("B[" + j + "]: ");
            B[j] = ler.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            int contador = 0;
            
            for (int j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    contador++;
                }
            }
            
            if (contador == 0) {
                C[posicaoC] = A[i];
                posicaoC++;
            }
        }
        
        System.out.println("\nDiferença entre o vetor A e B:");
        if (posicaoC == 0) {
            System.out.println("\nNão há elementos no conjunto diferença.");
        } else {
            for (int k = 0; k < posicaoC; k++) {
                if (k > 0) {
                    System.out.print(", ");
                }
                System.out.print(C[k]);
            }
            System.out.println(); 
        }

        ler.close();
    }
}