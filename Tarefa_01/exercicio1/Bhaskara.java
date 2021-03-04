package exercicio1;

import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {

	public static double a, b, c, delta, x1, x2;
	
	private static void leNumeros() {
		System.out.println("Digite os coeficientes A, B e C:");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
	}
	private static double calculaDelta(double a, double b, double c) {
		
		delta = Math.pow(b,b) - 4 * a * c;
			return delta;
		}
	private static void calculaBhaskara(double a, double b, double c, double delta) {
		
		if(delta < 0) {
			System.out.println("A equação não possui raízes reais!");
		}
		else if(delta == 0) {
			System.out.println("Raíz Única!");
			
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			System.out.println("O valor é: " + x1);
			
		}
		else {
			System.out.println("Raíz Única!");
			
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;
			
			System.out.println("O valor é: " + x1 + " e " + x2);
			
		}
	}
	
	public static void imprime() {
		
		leNumeros();
		calculaBhaskara(a, b, c, calculaDelta(a, b, c));	
		
	}
}


