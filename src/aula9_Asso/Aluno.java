package aula9_Asso;

public class Aluno {
	private int id;
	private String nome;		
	private Professor instrutor;	
	// Um dos atributos é um Objeto, assim como o nome que é da Classe String

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Professor instrutor) {
		this.instrutor = instrutor;
	}
	
	public void visualizar() {
		System.out.println("Id: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Professor(a): " + this.getInstrutor().getNome());
		// Nós acessamos o Objeto Instrutor, e dele acessamos o nome
	}
}
