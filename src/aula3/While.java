package aula3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		String continua = "s";
		// boolean continua = true;
		int numero1, numero2, resultado = 0;
		Scanner leia = new Scanner(System.in);

		while (continua.equals("s")) {
			// continua = 0 => numero > 0

			System.out.println("Digite o primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();

			resultado = numero1 + numero2;

			System.out.println("Resultado Final: " + resultado);

			System.out.println("Deseja continuar? (s/n)");
			continua = leia.next();
		}

		System.out.println("Fim do Programa");

	}

}
