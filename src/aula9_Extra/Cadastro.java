package aula9_Extra;

public class Cadastro {
	private String nome;
	private String profissao;
	private int idade;
	private String foto;
	private String modalidade;
	
	// Contrutor para os dados básicos do Visitante serem preenchidos
	public Cadastro() {}
	
	// Contrutor com dados básicos para Visitante
	public Cadastro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Construtor com todos os dados para Aluno
	public Cadastro(String nome, String profissao, int idade, String foto, String modalidade) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.foto = foto;
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public void visualizar() {		
		if(profissao == null || foto == null || modalidade == null) {
			System.out.println("Dados do Visitante");
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
			System.out.println();
		}else {
			System.out.println("Dados Alune");
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
			System.out.println("Profissão: " + getProfissao());
			System.out.println("Foto: " + getFoto());
			System.out.println("Modalidade: " + modalidade);
			System.out.println();
		}
		
	}
	
}
