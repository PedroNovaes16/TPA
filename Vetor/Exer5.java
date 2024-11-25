import java.util.Scanner;
public class Exer5 {
	   public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int i,numero,divisor;
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
	            System.out.println("\nElemento " + numero + ": Divisores:");

	             divisor = 1; 
	            while (divisor <= numero) { 
	                switch (numero % divisor) {
	                    case 0: 
	                        System.out.print(divisor + " ");
	                        break;
	                    default:
	                        break;
	                }
	                divisor++; 
	            }
	        }

	        ler.close();
	    }
	}

