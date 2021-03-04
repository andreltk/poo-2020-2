//Autor: André Luiz Teixeira Kohlrausch <andreluiztkufg@gmail.com>

package exercicio1;
import java.util.Scanner;

public class MaiorMenor {

	public static double a, b, c;
	
	public static void imprime() {
		
		leNumeros();
		System.out.println("O maior número é: "+ maiorNumero(a,b,c));
	}
	
	private static void leNumeros() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os três números:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
	
	}
	private static double maiorNumero(double a, double b, double c) {
		
		if(a > b && a > c) {
			return a;
		}
		else if (b > a && b > c) {
			return b;
		}
		else {
			return c;
		}
	}
}


