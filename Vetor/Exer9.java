import java.util.Scanner;
public class Exer9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int indiceC = 0,i,j,k; 
        final int TAM = 5;
        int A[] = new int[TAM];
        int B[] = new int[TAM];
        int C[] = new int[TAM];
        

        
        System.out.println("Digite 10 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        
        System.out.println("\nDigite 10 números para o vetor B:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = ler.nextInt();
        }

        
        for ( i = 0; i < TAM; i++) {
            
            for ( j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    
                    k = 0;
                    while (k < indiceC && C[k] != A[i]) {
                        k++;  
                    }
                    
                    if (k == indiceC) {
                        C[indiceC] = A[i];  
                        indiceC++;  
                    }
                    break;  
                }
            }
        }

        
        System.out.println("\nInterseção de A e B (vetor C):");
        if (indiceC == 0) {
            System.out.println("Não há interseção entre os vetores.");
        } else {
            for ( i = 0; i < indiceC; i++) {
                System.out.println("C[" + i + "] = " + C[i]);
            }
        }
        ler.close();
    }
}