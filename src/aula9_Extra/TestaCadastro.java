package aula9_Extra;

import java.util.Scanner;

public class TestaCadastro {

	public static void main(String[] args) {
		Cadastro cad = new Cadastro();
		Cadastro cad1 = new Cadastro("Júlia", 18);
		Cadastro cad2 = new Cadastro("Laura", "Designer", 25,"Foto", "Musculação");
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o nome do Visitante: ");
		cad.setNome(leia.nextLine());
		
		System.out.println("Insira a idade do Visitante: ");
		cad.setIdade(leia.nextInt());
		
		cad.visualizar();
		cad1.visualizar();
		cad2.visualizar();
	}

}
