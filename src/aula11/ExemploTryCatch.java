package aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int dividendo = 0;
		int divisor = 0;

		try {

			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();

			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();

			divide(dividendo, divisor);

		} catch (InputMismatchException e) {
			System.out.println("\nPor favor, digite apenas valores númericos");
			System.out.println("Nome da Exceção Disparada: " + e);
			System.err.println("Nome da Exceção Disparada: " + e.getLocalizedMessage());
			System.out.println("Nome da Exceção Disparada: " + e.getCause());
		} catch (ArithmeticException a) {
			System.out.println("\nO número digitado precisa ser diferente de 0");
			System.err.println("Nome da Exceção Disparada: " + a);
			System.err.println("Nome da Exceção Disparada: " + a.getLocalizedMessage());
			System.err.println("Nome da Exceção Disparada: " + a.getCause());
			
		} finally {
			System.out.println("Obrigado por sua preferência");
		}

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
