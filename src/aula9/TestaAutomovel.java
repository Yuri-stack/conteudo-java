package aula9;

public class TestaAutomovel {

	public static void main(String[] args) {
		Automovel carro = new Automovel(5, 4, 80f, "Vermelho", 4, "GEN 6523", 3);
		//Automovel carro2 = new Automovel("Vermelho", 4, "GEN 6523", 3);
		
		carro.visualizar();
		//carro2.visualizar();
	}

}
