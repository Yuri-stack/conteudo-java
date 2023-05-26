package teste;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {

		String continua = "s";
		int numero, resultado;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número inteiro:");
			numero = leia.nextInt();

			resultado = numero * 8;

			System.out.println("Resultado: " + resultado);

		} while (numero >= 0);

		System.out.println("Programa Finalizado");

	}

}
