package aula3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		String nome;

		/*
		 * ANTES DO COMANDO FOR String nome1, nome2, nome3;
		 */

		Scanner leia = new Scanner(System.in);

		for (int contador = 1; contador < 4; contador++) {
			System.out.println("Digite o " + contador + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + contador + "º nome é: " + nome);
		}

		/*
		 * ANTES DO COMANDO FOR
		 * 
		 * System.out.println("Digite o 1º nome: "); nome1 = leia.nextLine();
		 * System.out.println("O 1º nome é: " + nome1);
		 * 
		 * System.out.println("\nDigite o 2º nome: "); nome2 = leia.nextLine();
		 * System.out.println("O 2º nome é: " + nome2);
		 * 
		 * System.out.println("\nDigite o 3º nome: "); nome3 = leia.nextLine();
		 * System.out.println("O 3º nome é: " + nome3);
		 */
	}

}
