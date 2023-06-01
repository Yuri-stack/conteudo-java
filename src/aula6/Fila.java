package aula6;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++) {
			fila.add(i);
		}

		System.out.println("\nPrimeiro Elemento da fila: " + fila.peek());
		
		System.out.println("\nElementos na fila: " + fila);
		
		System.out.println("\nRemover Elemento: " + fila.poll());

		System.out.println("\nFila atualizada: " + fila);

		System.out.println("\nAdicionar Elemento: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		fila.clear();
		
		System.out.println("\nExibir a Fila Vazia: " + fila);
		
		// fila.remove();
		
		System.out.println("\nTentando apagar item da Fila Vazia: " + fila.poll());
		
	}

}
