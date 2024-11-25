package listavetor;

import java.util.Scanner;

public class busca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        
        System.out.println("Digite os 10 elementos para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.print("\nDigite o n�mero que deseja buscar no vetor: ");
            int X = ler.nextInt();
            
            int encontrado = -1;
            
            for (int i = 0; i < 10; i++) {
                if (A[i] == X) {
                    encontrado = i;
                    break;
                    
                }
            }
            
            if (encontrado != -1) {
                System.out.println("\nO n�mero " + X + " est� presente no vetor na posi��o " + encontrado + ".");
            } else {
                System.out.println("\nO n�mero " + X + " n�o foi encontrado no vetor.");
            }
        }

        ler.close();
    }
}

