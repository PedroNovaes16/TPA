import java.util.Scanner;
public class Tabuada {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int r,n,i;
	System.out.println("Insira o Fator da Mutiplicação: ");
	n = ler.nextInt();
	i = 1;
	while(i<11) {
		r= n*i;
		System.out.println(r);
		i++;
	}
	ler.close();
}
}
