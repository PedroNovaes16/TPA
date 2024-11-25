package listavetor;

import java.util.Scanner;

public class busca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        
        System.out.println("Digite os 10 elementos para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.print("\nDigite o número que deseja buscar no vetor: ");
            int X = ler.nextInt();
            
            int encontrado = -1;
            
            for (int i = 0; i < 10; i++) {
                if (A[i] == X) {
                    encontrado = i;
                    break;
                    
                }
            }
            
            if (encontrado != -1) {
                System.out.println("\nO número " + X + " está presente no vetor na posição " + encontrado + ".");
            } else {
                System.out.println("\nO número " + X + " não foi encontrado no vetor.");
            }
        }

        ler.close();
    }
}

