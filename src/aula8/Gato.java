package aula8;

public class Gato {
	private String nome;
	private String raca;
	private int idade;
	private float peso;
		
	public Gato(String nomeGato, String racaGato, int idade, float peso) {
		this.nome = nomeGato;
		this.raca = racaGato;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeGato) {
		this.nome = nomeGato;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void miar() {
		System.out.println("Meow");
	}
}
