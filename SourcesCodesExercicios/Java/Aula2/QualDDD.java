package aula2;

import java.util.Scanner;

public class QualDDD {

	private static final char ESC = 27;

	public static void main(String[] args) {
		//Código para limpar console, mas não funciona no eclipse.
		//tem que importar a java.io.Console;
		/* throws Exception {
	    Console c = System.console();
	    if (c == null) {
	        System.err.println("no console");
	        System.exit(1);
	    }

	    // limpa o console
	    c.writer().print(ESC + "[2J");
	    c.flush();
	    **/
	    
		//cria objeto Scanner
		Scanner ler = new Scanner(System.in);
		//variável para o DDD inserido pelo usuário
		int dddUsuario;
		//pergunta ao usuário qual é o DDD
		System.out.println("Qual é o DDD?");
		//atribui o DDD inserido pelo usuário e valida
		dddUsuario = ler.nextInt();
		while( !(dddUsuario > 10 && dddUsuario < 100) ) {
			System.out.println("DDD inválido. Informe novamente:");
			dddUsuario = ler.nextInt();
		};
		
	    //imprime o DDD e sua respectiva capital
		switch(dddUsuario){
		case 61:
			System.out.println("61-Brasília");
			break;
		case 62:
			System.out.println("62-Goiânia");
			break;
		case 65:
			System.out.println("65-Cuiabá");
			break;
		case 67:
			System.out.println("67-Campo Grande");
			break;
		default:
			System.out.println("DDD não pertence a capital do centro-oeste brasileiro");
		}
		
		//fecha o scanner
		ler.close();
	}

}
