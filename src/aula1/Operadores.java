package aula1;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		
		fahrenheit = celsius * 1.8 + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

	}

}
