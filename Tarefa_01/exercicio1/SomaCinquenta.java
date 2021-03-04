//Autor: André Luiz Teixeira Kohlrausch <andreluiztkufg@gmail.com>

package exercicio1;

public class SomaCinquenta {

	public static int numero, resultado;

	public static void imprime() {

		resultado = numero = 1;


		for(numero = 1; numero <= 50; numero++) {

			resultado = (numero - 1) + numero;
			
				if(numero > 1 ) {
					if(numero%10 == 0)
						System.out.printf("\n");
					else
					System.out.print(", ");
				}
				
				//Caso seja necessário mostrar cada soma 
				//System.out.print(numero + " + " +  numero + " = " + resultado);
				
				System.out.print(resultado);
				
			

		}
		System.out.println("\nResultado Final = resultado");
	}
}


