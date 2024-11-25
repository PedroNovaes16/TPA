import java.util.Scanner;
public class Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i,numero,contador;
        final int TAM = 10;
        int A[] = new int[TAM];

       
        System.out.println("Digite 10 números para o vetor A:");
        for ( i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }

        
        System.out.println("\nResultados:");
        for ( i = 0; i < TAM; i++) {
             numero = A[i];
            System.out.println("\nElemento " + numero + ":");

             contador = 0; 
            while (contador <= numero) { 
                switch (contador % 2) {
                    case 0: 
                        System.out.print(contador + " ");
                        break;
                    default:
                        break;
                }
                contador++; 
            }
        }

        ler.close();
    }
}
	
	

