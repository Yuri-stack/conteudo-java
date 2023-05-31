package aula6;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();

		pilha.push("O Assassinato no Expresso do Oriente");
		pilha.push("Alquimista");
		pilha.push("Como Influenciar Pessoas");
		pilha.push("Persépolis");
		pilha.push("Um Estudo em Vermelho");
		
		System.out.println("\nElemento no topo da Pilha: " + pilha.peek());
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());
		
		System.out.println("\nPilha atualizada: " + pilha);
		
		System.out.println("\nAdicionar Elemento: " + pilha.push("Duna"));
		
		System.out.println("\nExibir a Pilha Atualizada: " + pilha);

	}

}
