package exercicios0209;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        int i = 1, n, n1, expoente;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do número que deseja potenciar");
        n = in.nextInt();
        n1 = n;
        System.out.println("Digite o expoente do número que deseja potenciar");
        expoente = in.nextInt();
        if(expoente == 0) {
    		System.out.println("O resultado é: "+1);
    	}
        while(i<expoente) {
        	if(expoente == 1) {
        		System.out.println("O resultado é: "+n);
        		break;
        	}
            n *= n1;
            i++;
        }
        if(expoente != 0 && expoente != 1){
        System.out.println("O resultado é: "+n);
        }
        in.close();
	}
    
}

