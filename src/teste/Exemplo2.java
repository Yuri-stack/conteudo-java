package teste;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		
		String continua = "s";
		int numero1, numero2, resultado = 0;
		Scanner leia = new Scanner(System.in);
		
		while(!continua.equalsIgnoreCase("n")) {
			
            System.out.println("Digite o primeiro valor: ");
            numero1 = leia.nextInt();
            
            System.out.println("Digite segundo valor: ");
            numero2 = leia.nextInt();
            
            resultado = numero1 + numero2;
            
            System.out.println("Resultado Final: " + resultado);
            
            System.out.println("Deseja somar dois valores? (s/n)");
            continua = leia.next();
		}
	}
}
