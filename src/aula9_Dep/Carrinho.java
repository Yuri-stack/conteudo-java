package aula9_Dep;

public class Carrinho {
	
	// O método mostraItem do carrinho, PRECISA de um objeto da classe Produto
	public void mostraItem(Produto produto) {
		System.out.println("Id: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
	}
	
	// public void adicionarItem(Produto item) {}
	
	// public void removerItem() {}
}
