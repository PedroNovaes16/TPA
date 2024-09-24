package exercicios0209;

import java.util.Scanner;

public class NPrimos {
    public static void main(String[] args) {
        int i = 2, ocorrencias = 1, n, n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver se é primo ou não:");
        n = in.nextInt();
        n1 = n;
        while(i<=n) {
            n1 = n%i;
            if(n1==0){
                ocorrencias++;
            }
            i++;
        }
        if(ocorrencias==2){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }
        in.close();
    }
}