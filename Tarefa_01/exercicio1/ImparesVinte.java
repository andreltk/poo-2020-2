/*
 * Corrigir que está considerando o número 27
 * Encontra melhor forma de fazer
 * */

package exercicio1;

public class ImparesVinte {

	public static int numero, resultado;

	public static void imprime() {

		for(numero = 1; numero <= 20; numero++) {

			if(numero % 2 != 0) {
				if(numero > 1 )
					System.out.print(", ");
			
				System.out.print(numero);
			}
		}
		System.out.print("\n");
	}
}

