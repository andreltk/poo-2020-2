//Autor: André Luiz Teixeira Kohlrausch <andreluiztkufg@gmail.com>

package exercicio1;
import java.lang.Math;
public class QuadradoVinte {

	public static int numero, resultado;

	public static void imprime() {

		resultado = numero = 1;


		while(true){

			resultado = (int) Math.pow(numero, 2);

			if(resultado <= 20) {
				if(numero > 1 )
					System.out.print(", ");
				System.out.print(resultado);
				numero++;
			}
			else {
				break;
			}
		}
		System.out.print("\n");
	}
}

