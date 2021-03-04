package exercicio1;


public class ContaUmVinte {

	public static int numero;

	public static void imprime() {

		for(numero = 1; numero <= 20; numero++) {

			if(numero > 1 )
				System.out.print(", ");
			
			System.out.print(numero);
		}
		System.out.print("\n");
	}
}