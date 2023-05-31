package extras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSetOrdenado {

	public static void main(String[] args) {
		Set<String> setFrutas = new HashSet<String>();

		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/*
		 * Criamos uma Collection do Tipo ArrayList, e dentro do seus paranteses
		 * passamos a Collection setFrutas
		 */
		List<String> listaFrutas = new ArrayList<>(setFrutas);

		/*
		 * Com isso, podemos usar o método .sort() para agora ordenar a 
		 * Lista de Frutas, ação essa que não era possível antes pois a 
		 * Collection Set não tem possuí ação de Ordenação de Strings
		 * */
		Collections.sort(listaFrutas);

		System.out.println("\nDados da Collection: " + setFrutas);
		System.out.println("\nDados da Collection: " + listaFrutas);

	}

}
