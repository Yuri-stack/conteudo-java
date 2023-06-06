package aula10;

public class Professor extends Pessoa implements Instrucao, Natacao {
	private int idade;
	
	public Professor(String nome, int idade) {
		super(nome);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public void falar() {
		System.out.println("Bora fazer exercício!");
	}
	
	@Override
	public void ensinar() {
		System.out.println("Ensinando a nadar...");
	}
	
	@Override
	public String nadar() {
		// System.out.println("Nadando...");
		String resp = "Nadando...";
		return resp;
	}
}
