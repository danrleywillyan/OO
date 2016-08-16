package aula2;
import java.util.Scanner;

public class QualSexo {

	public static void main(String[] args) {
		//Declara objeto ler
		Scanner ler = new Scanner(System.in);
		//declara a string sexo
		String[] sexo = {"MACHO", "FÊMEA"};
		//inserção e validação da string inserida pelo usuário
		String usuarioDeclaracao;
		System.out.println("Qual é o seu sexo?");
		int i = 0; //para validação;
		do{
			//sexo de acordo com a teoria de gênero
			if(i != 0){
				System.out.println("Sexo inválido, tente MACHO ou FEMEA. Qual é o seu sexo?");
			}
			usuarioDeclaracao = ler.next();
			i++;
		}while( !( usuarioDeclaracao.equalsIgnoreCase("macho") | usuarioDeclaracao.equalsIgnoreCase("femea") ) );
		/*compara a string inserida com MACHO(caseInsensitive) e
		imprime MACHO ou FEMEA**/
		System.out.println("\n\n\n");
		System.out.println("\t\t\t\t" + (usuarioDeclaracao.equalsIgnoreCase(sexo[0]) ? sexo[0] : sexo[1]));
		
		ler.close();
	}
}