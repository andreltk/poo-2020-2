//Autor: André Luiz Teixeira Kohlrausch <andreluiztkufg@gmail.com>

package exercicio2;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro, gastosFevereiro, gastosMarco, gastosTrimestre;
		
		gastosJaneiro = 15000;
		gastosFevereiro = 23000;
		gastosMarco = 17000;
		
		gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);

		int mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Valor da média mensal = " + mediaMensal);
	}

}
