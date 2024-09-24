package exercicios0209;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
		int i = 1, atual = 1, n, anterior = 0, proximo = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Insira até onde a sequência deverá chegar");
		n = in.nextInt();
		while(i<=n) {
			System.out.println(anterior);
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
			i++;
		}
		in.close();
	}


}
