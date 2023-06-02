package aula8;

public class GatoTeste {

	public static void main(String[] args) {
		Gato g1 = new Gato("Lua", "Siames", 6, 3.5f);
		
		System.out.println("Nome do Gato: " + g1.getNome());
		g1.setPeso(4.0f);
		
		g1.setIdade(7);
		System.out.println("Idade do Gato: " + g1.getIdade());
		
		System.out.println("Peso do Gato: " + g1.getPeso());
		g1.miar();
		
	}

}
