package extras;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();

		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println("O Número " + num + " é par e positivo!");
			} else {
				System.out.println("O Número " + num + " é impar e positivo!");
			}

		} else {
			if (num %2 == -1) {
				System.out.println("O número " + num + " é impar e negativo");
			} else {
				System.out.println("O número " + num + " é par e negativo");
			}
		}

	}

}
