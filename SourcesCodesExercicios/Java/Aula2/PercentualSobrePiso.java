package aula2;
import java.util.Scanner;


public class PercentualSobrePiso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		final int PISO_SALARIAL = 1000;
		int valorInserido;
		float percentual = 0f;
		
		System.out.println("Qual é o valor percentual a ser calculado sobre o piso " +
				"salarial?");
		
		valorInserido = ler.nextInt();
		percentual = (valorInserido/100f) * PISO_SALARIAL;
		
		System.out.println("Valor percentual sobre o piso salarial é: " + 
				percentual);
		ler.close();
	}

}
