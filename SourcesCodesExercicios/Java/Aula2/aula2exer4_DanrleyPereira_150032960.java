package aula2;

import java.util.Scanner;

public class PesoElefantes {

	public static void main(String[] args) {
		
		int[] pesoElefantes = new int[3];
		
		for(int i= 0; i<3; i++) {
			System.out.println("Insira o peso do elefante nº"+(i+1)+":");
			pesoElefantes[i] = atribuiPeso();
		}
		
		pesoElefantes = sortArray(pesoElefantes);
		
		for(int i=0; i<3; i++){
			System.out.println("Elefante"+ (i+1) + " tem o peso: " + pesoElefantes[i] );
		};
		
	}
	
	public static int atribuiPeso(){
		Scanner ler = new Scanner(System.in);
		int peso;
		do{
			peso = ler.nextInt();
		}while( peso < 5  );
		return peso;
	}
	//Array.sort(Array) já há um método que faz isso. import java.util.Array
	public static int[] sortArray (int[] novoArray)
	{
	    for(int x = 0; x < novoArray.length; x++) //a.length = tamanho do array
	    {
	        for(int y = 0; y < novoArray.length; y++)
	        {
	            if(novoArray[x] < novoArray[y])
	            {
	            	int temporario = novoArray[x];
	                novoArray[x] = novoArray[y];
	                novoArray[y] = temporario;
	            }
	        }
	    }

	    return novoArray;
	}

}
