package aula4;

public class Vetor {

	public static void main(String[] args) {
				
		String vetorCachorros[] = {"Boxer", "Pastor A", "Pinscher", "Husky", "Corgi"};
		
		for(int numero = 0; numero < 5; numero++) {
            System.out.println((numero + 1) + "º Casa: " + vetorCachorros[numero]);  
        }
		
		System.out.println("O tamanho do Vetor é " + vetorCachorros.length);
	}

}
