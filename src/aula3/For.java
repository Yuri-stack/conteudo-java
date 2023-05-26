package aula3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		String nome;
		
        Scanner leia = new Scanner(System.in);
        
        for(int contador = 1; contador < 4; contador++) {
        	System.out.println("Digite o " + contador + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + "º nome é: " + nome);
        }
        
	}

}
