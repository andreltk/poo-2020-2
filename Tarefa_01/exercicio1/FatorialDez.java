package exercicio1;

public class FatorialDez {

	public static int numero, fatorial, contador;
	
	public static void imprime() {
		
		for(contador = 1; contador <= 10; contador++) {
			
			numero = contador;
			fatorial = 1;
			while(numero > 1) {
				fatorial *= numero;
				numero--;
			}
				if(numero >= 1 )
					System.out.print(", ");
				System.out.print(fatorial);
		}
		System.out.print("\n");
	}
}


