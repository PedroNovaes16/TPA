
public class Exer6 {

 	   public static void main(String[] args) {
 		  final int TAM = 11;
	        int A[] = new int[TAM];

	        
	        for (int i = 0; i < TAM; i++) {  
	            int potencia = 1; 
	            int contador = 0; 

	            while (contador < i) {
	                potencia = potencia * 2; 
	                contador++;    
	            }

	            A[i] = potencia; 
	        }

	        
	        System.out.println("Vetor A (2^i):");
	        for (int i = 0; i < TAM; i++) {  
	            System.out.println("A[" + i + "] = " + A[i]);
	        }
	    }
	}
