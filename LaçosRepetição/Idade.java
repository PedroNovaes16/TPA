import java.util.Scanner;
public class Idade {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i,anoA,anoNas,idade;
	i=1;
	System.out.println("Insira o ano Atual: ");
	anoA = ler.nextInt();
	while(i<7) {
		System.out.println("Insira o ano de nascimento: ");
		anoNas = ler.nextInt();
		idade = anoA - anoNas;
		if(idade<18) {
			System.out.println("Menor de Idade");
		}
		else {
			System.out.println("Maior de Idade");
		}	
		System.out.println("Sua idade é :"+ idade);
		i++;
	}
	ler.close();
}
}
