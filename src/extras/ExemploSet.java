package extras;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> setFrutas = new HashSet<String>();
		Set<Integer> setNumeros = new HashSet<Integer>();
				
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		setNumeros.add(8);
		setNumeros.add(5);
		setNumeros.add(7);
		setNumeros.add(1);
		
		System.out.println("\nDados da Collection: " + setFrutas);
		System.out.println("\nDados da Collection: " + setNumeros);

	}

}
