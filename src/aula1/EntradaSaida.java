package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome = "";
		float distancia = 0.0f;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a distância: ");
		distancia = leia.nextFloat();
		
		System.out.println("\nParabéns " + nome + ","
				+ " a sua distância percorrida foi de " + distancia + "Km");
		
		System.out.printf("\nDistância Percorrida: %.2f", distancia);

	}

}
