package listavetor;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int TAM = 10; 
        int[] A = new int[TAM];
        
        System.out.println("Digite 10 n�meros inteiros para preencher o vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        int i;
        for (i = 0; i < TAM / 2; i++) {
            if (A[i] != A[TAM - 1 - i]) {
                break;
            }
        }
        
        if (i == TAM / 2) {
            System.out.println("O vetor � um pal�ndromo.");
        } else {
            System.out.println("O vetor n�o � um pal�ndromo.");
        }
        ler.close();
    }
}