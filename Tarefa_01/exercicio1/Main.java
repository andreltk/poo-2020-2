//Feito por André Luiz Teixeira Kohlrausch
package exercicio1;

public class Main {
	
	public static void main(String[] args) {
	
		System.out.println("===============================================================\n");
		System.out.println("Olá, esse programa executa as seguintes operações:\n");
		System.out.println("1 - Dado 3 valores, mostra o maior e o menor");
		System.out.println("2 - Lista números de 1 a 20");
		System.out.println("3 - Lista os números quadrados de 1 a 20");
		System.out.println("4 - Lista os números ímpares de 1 a 20");
		System.out.println("5 - Lista a soma dos números de 1 a 50");
		System.out.println("6 - Lista o fatorial dos números de 1 a 10");
		System.out.println("7 - Dados os Valores A,B e C, calcula a fórmula de Bhaskara");
		System.out.println("===============================================================\n");
	
		System.out.println("\n==========Maior de 3 valores==========\n");
		exercicio1.MaiorMenor.imprime();
		
		System.out.println("\n==========Imprime de 1 a 20===========\n");
		exercicio1.ContaUmVinte.imprime();
		
		System.out.println("\n==========Quadrados de 1 a 20=========\n");
		exercicio1.QuadradoVinte.imprime();
		
		System.out.println("\n==========Ímpares de 1 a 20===========\n");
		exercicio1.ImparesVinte.imprime();
		
		System.out.println("\n==========Soma números 1 a 20=========\n");
		exercicio1.SomaCinquenta.imprime();
		
		System.out.println("\n==========Fatorial de 1 a 10==========\n");
		exercicio1.FatorialDez.imprime();
		
		System.out.println("\n==========Fórmula de Bhaskara=========\n");
		exercicio1.Bhaskara.imprime();
		
		System.out.println("\n======================================\n");
	}
}



