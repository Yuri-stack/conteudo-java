package aula3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int numero, resultado;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número inteiro:");
			numero = leia.nextInt();

			resultado = numero * 5;

			System.out.println("Resultado: " + resultado);
			
		}while(numero >= 0);
		
		System.out.println("Fim do Programa");

	}
}
