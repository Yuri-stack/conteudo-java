package aula9_Dep;

public class Produto {

	private int id;
	private String nome;
	private float preco;
		
	public Produto(int idProduto, String nomeProduto, float precoProduto) {
		this.id = idProduto;
		this.nome = nomeProduto;
		this.preco = precoProduto;
	}

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
